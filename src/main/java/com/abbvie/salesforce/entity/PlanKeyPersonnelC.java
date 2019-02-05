package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the plan_key_personnel__c database table.
 * 
 */
@Data	
@Entity
@Table(name="plan_key_personnel__c")
public class PlanKeyPersonnelC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="approver__c")
	private Boolean approverC;

	@Column(name="company_personnel_assignment__c")
	private String companyPersonnelAssignmentC;

	@Column(name="ownerid")
	private String ownerid;

	@Column(name="reviewer__c")
	private Boolean reviewerC;

	@Column(name="role__c")
	private String roleC;
	
	@Column(name="isdeleted")
	private Boolean isdeleted;

	@Column(name="lastmodifiedbyid")
	private String lastmodifiedbyid;

	@Column(name="lastmodifieddate")
	private Timestamp lastmodifieddate;
	
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