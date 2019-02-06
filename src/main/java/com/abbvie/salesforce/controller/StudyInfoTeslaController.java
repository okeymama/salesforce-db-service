/**
 * 
 */
package com.abbvie.salesforce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abbvie.salesforce.dto.StudyInfoTeslaDTO;
import com.abbvie.salesforce.service.StudyInfoTeslaService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cchaubey
 *
 */
@Slf4j
@RestController
@RequestMapping("/StudyInfoTeslaController")
@CrossOrigin(value ="*")
public class StudyInfoTeslaController {

	@Autowired
	private StudyInfoTeslaService studyInfoTeslaService;
	
	@PostMapping("/getStudyInfoTeslaDTO")
	 public @ResponseBody ResponseEntity<StudyInfoTeslaDTO> getStudyInfoTeslaDTO(@RequestBody String studyId){
		log.info("Inside StudyInfoTeslaController.getStudyInfoTeslaDTOList: ");
		StudyInfoTeslaDTO studyInfoTeslaDTOs = studyInfoTeslaService.getStudyInfoTeslaDTOList(studyId);
		return ResponseEntity.ok(studyInfoTeslaDTOs);
	 }
	
}
