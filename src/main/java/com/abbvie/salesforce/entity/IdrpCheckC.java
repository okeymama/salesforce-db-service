package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


/**
 * The persistent class for the idrp_check__c database table.
 * 
 */

@Data	
@Entity
@Table(name="idrp_check__c")
public class IdrpCheckC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="applicable_compound__c")
	private String applicableCompoundC;

	@Column(name="applicable_data_category__c")
	private String applicableDataCategoryC;

	@Column(name="applicable_indication__c")
	private String applicableIndicationC;

	@Column(name="applicable_phase__c")
	private String applicablePhaseC;

	@Column(name="applicable_ta__c")
	private String applicableTaC;

	@Column(name="description__c")
	private String descriptionC;

	@Column(name="frequency__c")
	private String frequencyC;

	@Temporal(TemporalType.DATE)
	private Date lastactivitydate;

	@Column(name="lastreferenceddate")
	private Timestamp lastreferenceddate;

	@Column(name="lastvieweddate")
	private Timestamp lastvieweddate;

	@Column(name="method__c")
	private String methodC;

	@Column(name="ownerid")
	private String ownerid;

	@Column(name="purpose__c")
	private String purposeC;

	@Column(name="recordtypeid")
	private String recordtypeid;

	@Column(name="role__c")
	private String roleC;

	@Column(name="status__c")
	private String statusC;

	@Column(name="therapeutic_area__c")
	private String therapeuticAreaC;

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