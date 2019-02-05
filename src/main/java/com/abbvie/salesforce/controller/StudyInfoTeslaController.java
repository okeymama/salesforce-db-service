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
public class StudyInfoTeslaController {

	@Autowired
	private StudyInfoTeslaService studyInfoTeslaService;
	
	@PostMapping("/getStudyInfoTeslaDTOList")
	 public @ResponseBody ResponseEntity<List<StudyInfoTeslaDTO>> getStudyInfoTeslaDTOList(@RequestBody List<String> studyIds){
		log.info("Inside StudyInfoTeslaController.getStudyInfoTeslaDTOList: ");
		List<StudyInfoTeslaDTO> studyInfoTeslaDTOs = studyInfoTeslaService.getStudyInfoTeslaDTOList(studyIds);
		return ResponseEntity.ok(studyInfoTeslaDTOs);
	 }
	
}
