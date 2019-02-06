/**
 * 
 */
package com.abbvie.salesforce.dto;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

/**
 * @author cchaubey
 *
 */
@Data
public class IdrpTemplatesCDTO {

	private Integer id;

	private String hcErr;

	private String hcLastop;

	private String applicableCompoundC;

	private String applicableIndicationC;

	private String applicablePhaseC;

	private String applicableTaC;

	private String descriptionC;

	private Timestamp lastreferenceddate;

	private Timestamp lastvieweddate;

	private String ownerid;

	private String statusC;

	private Boolean isdeleted;

	private String lastmodifiedbyid;

	private Timestamp lastmodifieddate;
	
	private String createdbyid;

	private Timestamp createddate;

	private String name;

	private String sfid;

	private Timestamp systemmodstamp;
	
	private List<IdrpCheckCDTO> IdrpCheckCDTOs;
	
}
