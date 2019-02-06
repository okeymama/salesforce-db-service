/**
 * 
 */
package com.abbvie.salesforce.dto;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

/**
 * @author cchaubey
 *
 */
@Data
public class IdrpCheckCDTO {

	private Integer id;

	private String hcErr;

	private String hcLastop;

	private String applicableCompoundC;

	private String applicableDataCategoryC;

	private String applicableIndicationC;

	private String applicablePhaseC;

	private String applicableTaC;

	private String descriptionC;

	private String frequencyC;

	private Date lastactivitydate;

	private Timestamp lastreferenceddate;

	private Timestamp lastvieweddate;

	private String methodC;

	private String ownerid;

	private String purposeC;

	private String recordtypeid;

	private String roleC;

	private String statusC;

	private String therapeuticAreaC;

	private Boolean isdeleted;

	private String lastmodifiedbyid;

	private Timestamp lastmodifieddate;
	
	private String createdbyid;

	private Timestamp createddate;

	private String name;

	private String sfid;

	private Timestamp systemmodstamp;
	
}
