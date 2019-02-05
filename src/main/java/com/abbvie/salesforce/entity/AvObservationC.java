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
 * The persistent class for the av_observation__c database table.
 * 
 */
@Data	
@Entity
@Table(name="av_observation__c")
public class AvObservationC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="av_action_item_status_count__c")
	private double avActionItemStatusCountC;

	@Column(name="av_actual_value__c")
	private String avActualValueC;

	@Column(name="av_additional_information__c")
	private String avAdditionalInformationC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_anticipated_date_of_change__c")
	private Date avAnticipatedDateOfChangeC;

	@Column(name="av_any_procedures_performed_on_subject__c")
	private String avAnyProceduresPerformedOnSubjectC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_awareness_date__c")
	private Date avAwarenessDateC;

	@Column(name="av_category__c")
	private String avCategoryC;

	@Column(name="av_checklist_question__c")
	private String avChecklistQuestionC;

	@Column(name="av_closed_cancelled_by__c")
	private String avClosedCancelledByC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_closed_cancelled_date__c")
	private Date avClosedCancelledDateC;

	@Column(name="av_comments__c")
	private String avCommentsC;

	@Column(name="av_comments_additional_relevant_details__c")
	private String avCommentsAdditionalRelevantDetailsC;

	@Column(name="av_country_if_applicable__c")
	private String avCountryIfApplicableC;

	@Column(name="av_data_load_id__c")
	private String avDataLoadIdC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_date_of_occurrence__c")
	private Date avDateOfOccurrenceC;

	@Column(name="av_decision__c")
	private String avDecisionC;

	@Column(name="av_delete_flag__c")
	private Boolean avDeleteFlagC;

	@Column(name="av_describe_observation__c")
	private String avDescribeObservationC;

	@Column(name="av_doc_management_central_mailbox__c")
	private String avDocManagementCentralMailboxC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_effective_date__c")
	private Date avEffectiveDateC;

	@Column(name="av_escalate_issue__c")
	private String avEscalateIssueC;

	@Column(name="av_escalate_to__c")
	private String avEscalateToC;

	@Column(name="av_external_unique_id__c")
	private String avExternalUniqueIdC;

	@Column(name="av_file_type__c")
	private String avFileTypeC;

	@Column(name="av_functional_contact__c")
	private String avFunctionalContactC;

	@Column(name="av_impact_compliance__c")
	private String avImpactComplianceC;

	@Column(name="av_impact_data_quality__c")
	private String avImpactDataQualityC;

	@Column(name="av_impact_investigational_product__c")
	private String avImpactInvestigationalProductC;

	@Column(name="av_impact_safety__c")
	private String avImpactSafetyC;

	@Column(name="av_impact_study_timeline__c")
	private String avImpactStudyTimelineC;

	@Column(name="av_include_in_csr__c")
	private String avIncludeInCsrC;

	@Column(name="av_key_decision_details_if_applicable__c")
	private String avKeyDecisionDetailsIfApplicableC;

	@Column(name="av_name_of_abbvie_vendor_site_personnel__c")
	private String avNameOfAbbvieVendorSitePersonnelC;

	@Column(name="av_name_of_departing_personnel__c")
	private String avNameOfDepartingPersonnelC;

	@Column(name="av_name_of_new_personnel__c")
	private String avNameOfNewPersonnelC;

	@Column(name="av_name_of_person_to_be_trained__c")
	private String avNameOfPersonToBeTrainedC;

	@Column(name="av_name_of_replacement__c")
	private String avNameOfReplacementC;

	@Column(name="av_other_impacts_on_the_study__c")
	private String avOtherImpactsOnTheStudyC;

	@Column(name="av_overall_detectability__c")
	private String avOverallDetectabilityC;

	@Column(name="av_overall_impact_level__c")
	private String avOverallImpactLevelC;

	@Column(name="av_overall_probability__c")
	private String avOverallProbabilityC;

	@Column(name="av_pi_present_at_the_last_visit__c")
	private String avPiPresentAtTheLastVisitC;

	@Column(name="av_potential_root_cause__c")
	private String avPotentialRootCauseC;

	@Column(name="av_provide_inclusion_exclusion_number__c")
	private double avProvideInclusionExclusionNumberC;

	@Column(name="av_provide_name_of_staff__c")
	private String avProvideNameOfStaffC;

	@Column(name="av_reason_for_aesae_reportingobservation__c")
	private String avReasonForAesaeReportingobservationC;

	@Column(name="av_reason_for_change_always_show_csr__c")
	private Boolean avReasonForChangeAlwaysShowCsrC;

	@Column(name="av_reason_for_change_alwys_show_escalate__c")
	private Boolean avReasonForChangeAlwysShowEscalateC;

	@Column(name="av_reason_for_facility_change__c")
	private String avReasonForFacilityChangeC;

	@Column(name="av_reason_for_observation__c")
	private String avReasonForObservationC;

	@Column(name="av_reason_for_study_procedure_observatio__c")
	private String avReasonForStudyProcedureObservatioC;

	@Column(name="av_receiving_site__c")
	private String avReceivingSiteC;

	@Column(name="av_related_child_observation__c")
	private String avRelatedChildObservationC;

	@Column(name="av_related_country_name__c")
	private String avRelatedCountryNameC;

	@Column(name="av_related_parent_observation__c")
	private String avRelatedParentObservationC;

	@Column(name="av_related_pi_primary_facility_risk__c")
	private String avRelatedPiPrimaryFacilityRiskC;

	@Column(name="av_related_study__c")
	private String avRelatedStudyC;

	@Column(name="av_risk_descriptions__c")
	private String avRiskDescriptionsC;

	@Column(name="av_rule_configuration_name__c")
	private String avRuleConfigurationNameC;

	@Column(name="av_select_consent_process_observation__c")
	private String avSelectConsentProcessObservationC;

	@Column(name="av_select_observation__c")
	private String avSelectObservationC;

	@Column(name="av_select_type__c")
	private String avSelectTypeC;

	@Column(name="av_short_event_description__c")
	private String avShortEventDescriptionC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_sop_effective_date__c")
	private Date avSopEffectiveDateC;

	@Column(name="av_sop_number__c")
	private String avSopNumberC;

	@Column(name="av_sop_requirement_language__c")
	private String avSopRequirementLanguageC;

	@Column(name="av_sop_requirement_section__c")
	private String avSopRequirementSectionC;

	@Column(name="av_status__c")
	private String avStatusC;

	@Column(name="av_subcategory__c")
	private String avSubcategoryC;

	@Column(name="av_subject_number__c")
	private String avSubjectNumberC;

	@Column(name="av_supplies_type__c")
	private String avSuppliesTypeC;

	@Column(name="av_threshold__c")
	private String avThresholdC;

	@Column(name="av_tmf_category__c")
	private String avTmfCategoryC;

	@Column(name="av_tmf_document_name__c")
	private String avTmfDocumentNameC;

	@Column(name="av_topic__c")
	private String avTopicC;

	@Column(name="av_type_of_document_data__c")
	private String avTypeOfDocumentDataC;

	@Column(name="av_type_of_documents__c")
	private String avTypeOfDocumentsC;

	@Column(name="av_type_of_procedure__c")
	private String avTypeOfProcedureC;

	@Column(name="av_what_dose_and_route__c")
	private String avWhatDoseAndRouteC;

	@Column(name="av_what_duration__c")
	private String avWhatDurationC;

	@Column(name="av_what_is_the_complaint__c")
	private String avWhatIsTheComplaintC;

	@Column(name="av_what_is_the_improper_staff_delegation__c")
	private String avWhatIsTheImproperStaffDelegationC;

	@Column(name="av_what_is_the_status_of_the_consent__c")
	private String avWhatIsTheStatusOfTheConsentC;

	@Column(name="av_what_meeting_information__c")
	private String avWhatMeetingInformationC;

	@Column(name="av_what_type_of_consent__c")
	private String avWhatTypeOfConsentC;

	@Column(name="av_what_type_of_consent_is_missing__c")
	private String avWhatTypeOfConsentIsMissingC;

	@Column(name="av_which_criteria__c")
	private String avWhichCriteriaC;

	@Column(name="av_which_medication__c")
	private String avWhichMedicationC;

	@Column(name="ownerid")
	private String ownerid;

	@Column(name="recordtypeid")
	private String recordtypeid;
	
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