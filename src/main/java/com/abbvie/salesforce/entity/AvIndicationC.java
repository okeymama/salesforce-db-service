package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the av_indication__c database table.
 * 
 */
@Data	
@Entity
@Table(name="av_indication__c")
public class AvIndicationC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="av_data_load_id__c")
	private String avDataLoadIdC;

	@Column(name="av_delete_flag__c")
	private Boolean avDeleteFlagC;

	@Column(name="av_external_unique_id__c")
	private String avExternalUniqueIdC;

	@Column(name="av_indication_description__c")
	private String avIndicationDescriptionC;

	@Column(name="ownerid")
	private String ownerid;
	
	@Column(name="createdbyid")
	private String createdbyid;

	@Column(name="createddate")
	private Timestamp createddate;

	@Column(name="isdeleted")
	private Boolean isdeleted;

	@Column(name="lastmodifiedbyid")
	private String lastmodifiedbyid;

	@Column(name="lastmodifieddate")
	private Timestamp lastmodifieddate;

	@Column(name="name")
	private String name;

	@Column(name="sfid")
	private String sfid;

	@Column(name="systemmodstamp")
	private Timestamp systemmodstamp;

}