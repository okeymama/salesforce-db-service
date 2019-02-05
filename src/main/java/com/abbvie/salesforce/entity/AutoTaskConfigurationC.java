package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the auto_task_configuration__c database table.
 * 
 */
@Data
@Entity
@Table(name="auto_task_configuration__c")
public class AutoTaskConfigurationC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="auto_task_owner__c")
	private String autoTaskOwnerC;

	@Column(name="auto_task_priority__c")
	private String autoTaskPriorityC;

	@Column(name="idrp_config_rule__c")
	private String idrpConfigRuleC;

	@Column(name="lastreferenceddate")
	private Timestamp lastreferenceddate;

	@Column(name="lastvieweddate")
	private Timestamp lastvieweddate;

	@Column(name="task_description__c")
	private String taskDescriptionC;

	@Column(name="task_id__c")
	private String taskIdC;

	@Column(name="task_trigger__c")
	private String taskTriggerC;

	@Column(name="taskowner__c")
	private String taskownerC;
	
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