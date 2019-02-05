package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the idrp_templates__c database table.
 * 
 */
@Data	
@Entity
@Table(name="idrp_templates__c")
public class IdrpTemplatesC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="applicable_compound__c")
	private String applicableCompoundC;

	@Column(name="applicable_indication__c")
	private String applicableIndicationC;

	@Column(name="applicable_phase__c")
	private String applicablePhaseC;

	@Column(name="applicable_ta__c")
	private String applicableTaC;

	@Column(name="description__c")
	private String descriptionC;

	@Column(name="lastreferenceddate")
	private Timestamp lastreferenceddate;

	@Column(name="lastvieweddate")
	private Timestamp lastvieweddate;

	@Column(name="ownerid")
	private String ownerid;

	@Column(name="status__c")
	private String statusC;

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