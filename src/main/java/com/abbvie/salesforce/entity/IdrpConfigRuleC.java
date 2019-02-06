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
 * The persistent class for the idrp_config_rule__c database table.
 * 
 */
@Data	
@Entity
@Table(name="idrp_config_rule__c")
public class IdrpConfigRuleC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="check_completion_window__c")
	private Double checkCompletionWindowC;

	@Column(name="compound__c")
	private String compoundC;

	@Temporal(TemporalType.DATE)
	@Column(name="effective_end_date__c")
	private Date effectiveEndDateC;

	@Temporal(TemporalType.DATE)
	@Column(name="effective_start_date__c")
	private Date effectiveStartDateC;

	@Column(name="healthy_volunteers__c")
	private Boolean healthyVolunteersC;

	@Column(name="indication__c")
	private String indicationC;

	@Column(name="lastreferenceddate")
	private Timestamp lastreferenceddate;

	@Column(name="lastvieweddate")
	private Timestamp lastvieweddate;

	@Column(name="ownerid")
	private String ownerid;

	@Column(name="phase__c")
	private String phaseC;

	@Column(name="plan_owner__c")
	private String planOwnerC;

	@Column(name="review_workflow_window__c")
	private Double reviewWorkflowWindowC;

	@Column(name="rule_id__c")
	private String ruleIdC;

	@Column(name="rule_rationale__c")
	private String ruleRationaleC;

	@Column(name="status__c")
	private String statusC;

	@Column(name="study_number__c")
	private String studyNumberC;

	@Column(name="ta__c")
	private String taC;

	@Column(name="task_priority_high__c")
	private Double taskPriorityHighC;

	@Column(name="task_priority_low__c")
	private Double taskPriorityLowC;

	@Column(name="task_priority_medium__c")
	private Double taskPriorityMediumC;
	
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