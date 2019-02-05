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
 * The persistent class for the av_event_date__c database table.
 * 
 */
@Data	
@Entity
@Table(name="av_event_date__c")
public class AvEventDateC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Temporal(TemporalType.DATE)
	@Column(name="av_actual_date__c")
	private Date avActualDateC;

	@Column(name="av_comments__c")
	private String avCommentsC;

	@Column(name="av_data_load_id__c")
	private String avDataLoadIdC;

	@Column(name="av_delete_flag__c")
	private Boolean avDeleteFlagC;

	@Column(name="av_event__c")
	private String avEventC;

	@Column(name="av_is_email_apex__c")
	private Boolean avIsEmailApexC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_planned_date__c")
	private Date avPlannedDateC;

	@Column(name="av_study__c")
	private String avStudyC;

	@Column(name="av_study_country__c")
	private String avStudyCountryC;

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