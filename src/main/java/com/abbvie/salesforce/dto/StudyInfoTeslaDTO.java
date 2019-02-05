/**
 * 
 */
package com.abbvie.salesforce.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author cchaubey
 *
 */
@Data
public class StudyInfoTeslaDTO {

	private ReferenceDTO referenceDTO;
	
	private List<KeyEventsDTO> keyEventsDTO;
	
	private Map<String,List<String>> personalAssignmentMap;

}
