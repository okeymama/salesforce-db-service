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
 * The persistent class for the plan_key_event__c database table.
 * 
 */
@Data	
@Entity
@Table(name="plan_key_event__c")
public class PlanKeyEventC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Temporal(TemporalType.DATE)
	@Column(name="actual_date__c")
	private Date actualDateC;

	@Column(name="event__c")
	private String eventC;

	@Column(name="event_date__c")
	private String eventDateC;

	@Column(name="ownerid")
	private String ownerid;

	@Temporal(TemporalType.DATE)
	@Column(name="planned_date__c")
	private Date plannedDateC;

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