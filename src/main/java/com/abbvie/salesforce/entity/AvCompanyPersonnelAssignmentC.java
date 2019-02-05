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
 * The persistent class for the av_company_personnel_assignment__c database table.
 * 
 */
@Data	
@Entity
@Table(name="av_company_personnel_assignment__c")
public class AvCompanyPersonnelAssignmentC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="av_cpa_role__c")
	private String avCpaRoleC;

	@Column(name="av_data_load_id__c")
	private String avDataLoadIdC;

	@Column(name="av_delete_flag__c")
	private Boolean avDeleteFlagC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_end_date__c")
	private Date avEndDateC;

	@Column(name="av_external_unique_id__c")
	private String avExternalUniqueIdC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_start_date__c")
	private Date avStartDateC;

	@Column(name="av_study__c")
	private String avStudyC;

	@Column(name="av_study_country__c")
	private String avStudyCountryC;

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