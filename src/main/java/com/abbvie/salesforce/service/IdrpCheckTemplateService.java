/**
 * 
 */
package com.abbvie.salesforce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.abbvie.salesforce.dto.IdrpCheckCDTO;
import com.abbvie.salesforce.dto.IdrpTemplatesCDTO;
import com.abbvie.salesforce.entity.IdrpCheckC;
import com.abbvie.salesforce.entity.IdrpJunctionC;
import com.abbvie.salesforce.entity.IdrpTemplatesC;
import com.abbvie.salesforce.repository.IdrpCheckCRepository;
import com.abbvie.salesforce.repository.IdrpJunctionCRepository;
import com.abbvie.salesforce.repository.IdrpTemplatesCRepository;

/**
 * @author cchaubey
 *
 */
@Service
public class IdrpCheckTemplateService {
	
	@Autowired
	private IdrpTemplatesCRepository idrpTemplatesCRepository;
	
	@Autowired
	private IdrpJunctionCRepository idrpJunctionCRepository;
	
	@Autowired
	private IdrpCheckCRepository idrpCheckCRepository;

	public List<IdrpTemplatesCDTO> getAllIDRPCheckTemplates() {
		List<String> idrpCheckIds = null;
		List<IdrpTemplatesCDTO> idrpTemplatesCDTOs = new ArrayList<>();
		Map<String,List<String>> idrpTempltAndCheckIdMap = new HashMap<>();
		Map<String,IdrpCheckC> idrpCheckSfidAndCheckObjCMap = new HashMap<>();

		List<IdrpTemplatesC> idrpTemplatesCs = idrpTemplatesCRepository.findAll();
		List<String> idrpTemplatesSfids = idrpTemplatesCs.stream().map(IdrpTemplatesC::getSfid).collect(Collectors.toList());

		List<IdrpJunctionC> idrpJunctionCs = idrpJunctionCRepository.findByChildOfIdrpTemplateCIn(idrpTemplatesSfids);
		for(IdrpJunctionC idrpJunctionC : idrpJunctionCs) {
			idrpCheckIds = idrpTempltAndCheckIdMap.get(idrpJunctionC.getChildOfIdrpTemplateC());
			if(CollectionUtils.isEmpty(idrpCheckIds)) {
				idrpCheckIds = new ArrayList<>();
				idrpCheckIds.add(idrpJunctionC.getChildOfIdrpCheckC());
				idrpTempltAndCheckIdMap.put(idrpJunctionC.getChildOfIdrpTemplateC(),idrpCheckIds);
			}else {
				idrpCheckIds.add(idrpJunctionC.getChildOfIdrpCheckC());
			}
		}

		if(!CollectionUtils.isEmpty(idrpTempltAndCheckIdMap)) {
			List<String> idrpCheckSfids = new ArrayList<>();
			for(List<String> strList :idrpTempltAndCheckIdMap.values()) {
				idrpCheckSfids.addAll(strList);
			}
			List<IdrpCheckC> idrpCheckCs = idrpCheckCRepository.findAllBySfidIn(idrpCheckSfids);
			if(!CollectionUtils.isEmpty(idrpCheckCs)) {
				for(IdrpCheckC idrpCheckC: idrpCheckCs) {
					idrpCheckSfidAndCheckObjCMap.put(idrpCheckC.getSfid(), idrpCheckC);
				}
			}
		}

		for(IdrpTemplatesC idrpTemplatesC: idrpTemplatesCs) {
			IdrpTemplatesCDTO idrpTemplatesCDTO = new IdrpTemplatesCDTO();
			BeanUtils.copyProperties(idrpTemplatesC, idrpTemplatesCDTO);
			idrpCheckIds = idrpTempltAndCheckIdMap.get(idrpTemplatesC.getSfid());
			if(!CollectionUtils.isEmpty(idrpCheckIds)) {
				List<IdrpCheckCDTO> idrpCheckCDTOs = new ArrayList<>();
				for(String idrpCheckId : idrpCheckIds) {
					IdrpCheckCDTO idrpCheckCDTO = new IdrpCheckCDTO(); 
					BeanUtils.copyProperties(idrpCheckSfidAndCheckObjCMap.get(idrpCheckId),idrpCheckCDTO);
					idrpCheckCDTOs.add(idrpCheckCDTO);
				}
				idrpTemplatesCDTO.setIdrpCheckCDTOs(idrpCheckCDTOs);
			}
			idrpTemplatesCDTOs.add(idrpTemplatesCDTO);
		}
		return idrpTemplatesCDTOs;
	}	

}
