/**
 * 
 */
package com.abbvie.salesforce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abbvie.salesforce.dto.IdrpTemplatesCDTO;
import com.abbvie.salesforce.dto.StudyInfoTeslaDTO;
import com.abbvie.salesforce.service.IdrpCheckTemplateService;
import com.abbvie.salesforce.service.StudyInfoTeslaService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cchaubey
 *
 */
@Slf4j
@RestController
@RequestMapping("/IDRPCheckTemplateController")
public class IdrpCheckTemplateController {

	@Autowired
	private IdrpCheckTemplateService idrpCheckTemplatesService;
	
	@PostMapping("/getAllIDRPCheckTemplates")
	 public @ResponseBody ResponseEntity<List<IdrpTemplatesCDTO>> getAllIDRPCheckTemplates(){
		log.info("Inside IDRPCheckTemplateController.getAllIDRPCheckTemplates: ");
		List<IdrpTemplatesCDTO> idrpCheckTemplatesDTOs = idrpCheckTemplatesService.getAllIDRPCheckTemplates();
		return ResponseEntity.ok(idrpCheckTemplatesDTOs);
	 }
	
	
}
