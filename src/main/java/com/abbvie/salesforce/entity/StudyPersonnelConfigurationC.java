package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the study_personnel_configuration__c database table.
 * 
 */
@Data
@Entity
@Table(name="study_personnel_configuration__c")
public class StudyPersonnelConfigurationC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="approver__c")
	private Boolean approverC;

	@Column(name="idrp_config_rule__c")
	private String idrpConfigRuleC;

	@Column(name="key_study_personnel__c")
	private String keyStudyPersonnelC;
	
	@Column(name="reviewer__c")
	private Boolean reviewerC;

	@Column(name="role__c")
	private String roleC;

	@Column(name="librarian__c")
	private Boolean librarianC;
	
	@Column(name="isdeleted")
	private Boolean isdeleted;

	@Column(name="lastmodifiedbyid")
	private String lastmodifiedbyid;

	@Column(name="lastmodifieddate")
	private Timestamp lastmodifieddate;

	@Column(name="lastreferenceddate")
	private Timestamp lastreferenceddate;

	@Column(name="lastvieweddate")
	private Timestamp lastvieweddate;
	
	@Column(name="createdbyid")
	private String createdbyid;

	@Column(name="createddate")
	private Timestamp createddate;

	@Column(name="name")
	private String name;

	@Column(name="sfid")
	private String sfid;

	@Column(name="systemmodstamp")
	private Timestamp systemmodstamp;

}