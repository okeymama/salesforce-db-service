/**
 * 
 */
package com.abbvie.salesforce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abbvie.salesforce.dto.KeyEventsDTO;
import com.abbvie.salesforce.dto.ReferenceDTO;
import com.abbvie.salesforce.dto.StudyInfoTeslaDTO;
import com.abbvie.salesforce.entity.AvStudyC;
import com.abbvie.salesforce.entity.IdrpConfigRuleC;
import com.abbvie.salesforce.entity.PlanKeyEventC;
import com.abbvie.salesforce.entity.StudyKeyEventC;
import com.abbvie.salesforce.entity.StudyPersonnelConfigurationC;
import com.abbvie.salesforce.repository.AvStudyCRepository;
import com.abbvie.salesforce.repository.IdrpConfigRuleCRepository;
import com.abbvie.salesforce.repository.PlanKeyEventCRepository;
import com.abbvie.salesforce.repository.StudyKeyEventCRepository;
import com.abbvie.salesforce.repository.StudyPersonnelConfigurationCRepository;

/**
 * @author cchaubey
 *
 */
@Service
public class StudyInfoTeslaService {
	
	@Autowired
	private PlanKeyEventCRepository planKeyEventCRepository;
	
	@Autowired
	private AvStudyCRepository avStudyCRepository;
	
	@Autowired
	private StudyPersonnelConfigurationCRepository studyPersonnelConfigurationCRepository;
	
	@Autowired
	private IdrpConfigRuleCRepository idrpConfigRuleCRepository;
	
	@Autowired
	private StudyKeyEventCRepository studyKeyEventCRepository;
	

	public @ResponseBody List<StudyInfoTeslaDTO> getStudyInfoTeslaDTOList(@RequestBody List<String> studyNumbers) {
		List<KeyEventsDTO> keyEventsDTOs = null;
		KeyEventsDTO keyEventsDTO = null;
		List<StudyInfoTeslaDTO> studyInfoTeslaDTOList = new ArrayList<>();	
		for(String studyNumber : studyNumbers) {
			StudyInfoTeslaDTO studyInfoTeslaDTO = new StudyInfoTeslaDTO();
			AvStudyC avStudyC = avStudyCRepository.findByAvStudyNumberC(studyNumber);
			IdrpConfigRuleC idrpConfigRuleC = idrpConfigRuleCRepository.findByStudyNumberC(studyNumber);
			if(null != idrpConfigRuleC) {
				ReferenceDTO referenceDTO = new ReferenceDTO();
				referenceDTO.setCompound(idrpConfigRuleC.getCompoundC());
				referenceDTO.setFullProtocalTitle(avStudyC.getAvProtocolTitleC());
				referenceDTO.setIndication(idrpConfigRuleC.getIndicationC());
				referenceDTO.setStudyPhase(avStudyC.getAvStudyPhaseC());
				referenceDTO.setStudyStatus(avStudyC.getAvStudyStatusC());
				referenceDTO.setStudyType(avStudyC.getAvStudyTypeC());
				referenceDTO.setTherapeuticArea(avStudyC.getAvRelatedTherapeuticAreaC());
				studyInfoTeslaDTO.setReferenceDTO(referenceDTO);

				List<StudyKeyEventC> studyKeyEventCs = studyKeyEventCRepository.findByidrpConfigRuleC(idrpConfigRuleC.getSfid());
				if(!CollectionUtils.isEmpty(studyKeyEventCs)) {
					List<String> eventIds= studyKeyEventCs.stream().map(StudyKeyEventC::getEventC).collect(Collectors.toList());
					List<PlanKeyEventC> planKeyEventCs = planKeyEventCRepository.findByEventCIn(eventIds);
					if(!CollectionUtils.isEmpty(planKeyEventCs)) {
						keyEventsDTOs = new ArrayList<>();
						for(PlanKeyEventC planKeyEventC : planKeyEventCs) {
							keyEventsDTO = new KeyEventsDTO();
							keyEventsDTO.setActualDate(planKeyEventC.getActualDateC());;
							keyEventsDTO.setEventName(planKeyEventC.getName());
							keyEventsDTO.setPlannedDate(planKeyEventC.getPlannedDateC());
							keyEventsDTOs.add(keyEventsDTO);
						}
						studyInfoTeslaDTO.setKeyEventsDTO(keyEventsDTOs);
					}
				}
				
				List<StudyPersonnelConfigurationC> studyPersonnelConfigurationCs = studyPersonnelConfigurationCRepository.findByIdrpConfigRuleC(idrpConfigRuleC.getSfid());
				if(!CollectionUtils.isEmpty(studyPersonnelConfigurationCs)) {
					Map<String,List<String>> personalAssignmentMap = new HashMap<>();;
					for(StudyPersonnelConfigurationC studyPersonnelConfigurationC : studyPersonnelConfigurationCs) {
							List<String> value = new ArrayList<>();
							if(studyPersonnelConfigurationC.getApproverC()) {
								value.add("A");
							}
							if(studyPersonnelConfigurationC.getReviewerC()) {
								value.add("R");
							}
							personalAssignmentMap.put(studyPersonnelConfigurationC.getName(), value);
						studyInfoTeslaDTO.setPersonalAssignmentMap(personalAssignmentMap);
					}
					
				}
			}
			studyInfoTeslaDTOList.add(studyInfoTeslaDTO);
		}
		return studyInfoTeslaDTOList;
	}

}
