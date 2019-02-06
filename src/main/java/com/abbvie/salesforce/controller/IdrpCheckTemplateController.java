/**
 * 
 */
package com.abbvie.salesforce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abbvie.salesforce.dto.IdrpTemplatesCDTO;
import com.abbvie.salesforce.service.IdrpCheckTemplateService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cchaubey
 *
 */
@Slf4j
@RestController
@RequestMapping("/IDRPCheckTemplateController")
@CrossOrigin(value ="*")
public class IdrpCheckTemplateController {

	@Autowired
	private IdrpCheckTemplateService idrpCheckTemplatesService;
	
	@GetMapping("/getAllIDRPCheckTemplates")
	 public ResponseEntity<List<IdrpTemplatesCDTO>> getAllIDRPCheckTemplates(){
		log.info("Inside IDRPCheckTemplateController.getAllIDRPCheckTemplates: ");
		List<IdrpTemplatesCDTO> idrpCheckTemplatesDTOs = idrpCheckTemplatesService.getAllIDRPCheckTemplates();
		return ResponseEntity.ok(idrpCheckTemplatesDTOs);
	 }
	
	
}
