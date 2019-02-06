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
 * The persistent class for the av_study__c database table.
 * 
 */
@Data	
@Entity
@Table(name="av_study__c")
public class AvStudyC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="av_abbvie_partner_study__c")
	private String avAbbviePartnerStudyC;

	@Column(name="av_approved_planned_budget__c")
	private String avApprovedPlannedBudgetC;

	@Column(name="av_clinical_plan__c")
	private String avClinicalPlanC;

	@Column(name="av_collaborators__c")
	private String avCollaboratorsC;

	@Column(name="av_compass_number__c")
	private String avCompassNumberC;

	@Column(name="av_ct_gov_number__c")
	private String avCtGovNumberC;

	@Column(name="av_ct_gov_study_type__c")
	private String avCtGovStudyTypeC;

	@Column(name="av_data_load_id__c")
	private String avDataLoadIdC;

	@Column(name="av_data_monitoring_committee__c")
	private Boolean avDataMonitoringCommitteeC;

	@Column(name="av_delete_flag__c")
	private Boolean avDeleteFlagC;

	@Column(name="av_external_unique_id__c")
	private String avExternalUniqueIdC;

	@Column(name="av_fda_regulated_intervention__c")
	private Boolean avFdaRegulatedInterventionC;

	@Column(name="av_ind_grantor__c")
	private String avIndGrantorC;

	@Column(name="av_ind_number_1__c")
	private String avIndNumber1C;

	@Column(name="av_ind_number_2__c")
	private String avIndNumber2C;

	@Column(name="av_ind_number_3__c")
	private String avIndNumber3C;

	@Column(name="av_ind_number_4__c")
	private String avIndNumber4C;

	@Column(name="av_ind_serial_number__c")
	private String avIndSerialNumberC;

	@Column(name="av_indication__c")
	private String avIndicationC;

	@Column(name="av_is_enrollment_number_assigned__c")
	private Boolean avIsEnrollmentNumberAssignedC;

	@Column(name="av_is_event_date_assigned__c")
	private Boolean avIsEventDateAssignedC;

	@Column(name="av_last_country_setup__c")
	private Boolean avLastCountrySetupC;

	@Column(name="av_last_subject_first_dose__c")
	private Boolean avLastSubjectFirstDoseC;

	@Column(name="av_managed_by__c")
	private String avManagedByC;

	@Column(name="av_monitored_by__c")
	private String avMonitoredByC;

	@Column(name="av_monthly_status_update__c")
	private String avMonthlyStatusUpdateC;

	@Column(name="av_nickname__c")
	private String avNicknameC;

	@Column(name="av_number_of_planned_study_sites_in_sa__c")
	private Double avNumberOfPlannedStudySitesInSaC;

	@Column(name="av_number_of_treatment_arms__c")
	private Double avNumberOfTreatmentArmsC;

	@Column(name="av_paid__c")
	private String avPaidC;

	@Column(name="av_parent_study_protocol_number__c")
	private String avParentStudyProtocolNumberC;

	@Column(name="av_pbr_status__c")
	private String avPbrStatusC;

	@Column(name="av_phase__c")
	private String avPhaseC;

	@Column(name="av_phase_description__c")
	private String avPhaseDescriptionC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_planned_date_to_submit__c")
	private Date avPlannedDateToSubmitC;

	@Column(name="av_planned_sites_ex_us_total__c")
	private String avPlannedSitesExUsTotalC;

	@Column(name="av_planned_sites_us_total__c")
	private String avPlannedSitesUsTotalC;

	@Column(name="av_planned_study_sites__c")
	private String avPlannedStudySitesC;

	@Column(name="av_previous_recruitment_status__c")
	private String avPreviousRecruitmentStatusC;

	@Column(name="av_primary_compound__c")
	private String avPrimaryCompoundC;

	@Column(name="av_principal_investigator__c")
	private String avPrincipalInvestigatorC;

	@Column(name="av_product_funding_requested__c")
	private String avProductFundingRequestedC;

	@Column(name="av_product_manufactured_in_u_s__c")
	private Boolean avProductManufacturedInUSC;

	@Column(name="av_program__c")
	private String avProgramC;

	@Column(name="av_project__c")
	private String avProjectC;

	@Column(name="av_protocol_has_expanded_access__c")
	private Boolean avProtocolHasExpandedAccessC;

	@Column(name="av_protocol_title__c")
	private String avProtocolTitleC;

	@Column(name="av_publication_type__c")
	private String avPublicationTypeC;

	@Column(name="av_publication_venue__c")
	private String avPublicationVenueC;

	@Column(name="av_quantum_number__c")
	private String avQuantumNumberC;

	@Column(name="av_r_oss_number__c")
	private String avROssNumberC;

	@Column(name="av_recruitment_status__c")
	private String avRecruitmentStatusC;

	@Column(name="av_related_therapeutic_area__c")
	private String avRelatedTherapeuticAreaC;
	
	@Column(name="av_related_indication__c")
	private String avRelatedIndicationC;
	
	@Column(name="av_related_compound__c")
	private String avRelatedCompoundC;
	
	@Column(name="av_report_safety_letters_for_this_study__c")
	private Boolean avReportSafetyLettersForThisStudyC;

	@Column(name="av_responsible_party__c")
	private String avResponsiblePartyC;

	@Column(name="av_ric_number__c")
	private String avRicNumberC;

	@Column(name="av_section_801_clinical_trial__c")
	private Boolean avSection801ClinicalTrialC;

	@Column(name="av_sharepoint_anual_research_meeting_num__c")
	private String avSharepointAnualResearchMeetingNumC;

	@Column(name="av_site_selecton_notification_applicable__c")
	private Boolean avSiteSelectonNotificationApplicableC;

	@Column(name="av_spirit_number__c")
	private String avSpiritNumberC;

	@Column(name="av_sponsor_address__c")
	private String avSponsorAddressC;

	@Column(name="av_sponsor_country__c")
	private String avSponsorCountryC;

	@Column(name="av_sponsor_name__c")
	private String avSponsorNameC;

	@Column(name="av_status_change_rationale__c")
	private String avStatusChangeRationaleC;

	@Column(name="av_study_application_type__c")
	private String avStudyApplicationTypeC;

	@Column(name="av_study_description__c")
	private String avStudyDescriptionC;

	@Column(name="av_study_design_control_type__c")
	private String avStudyDesignControlTypeC;

	@Column(name="av_study_design_objective__c")
	private String avStudyDesignObjectiveC;

	@Column(name="av_study_name__c")
	private String avStudyNameC;

	@Column(name="av_study_number__c")
	private String avStudyNumberC;

	@Column(name="av_study_phase__c")
	private String avStudyPhaseC;

	@Column(name="av_study_priority__c")
	private String avStudyPriorityC;

	@Temporal(TemporalType.DATE)
	@Column(name="av_study_registration_date__c")
	private Date avStudyRegistrationDateC;

	@Column(name="av_study_rule_set_number__c")
	private String avStudyRuleSetNumberC;

	@Column(name="av_study_site_notification__c")
	private Boolean avStudySiteNotificationC;

	@Column(name="av_study_sponsor__c")
	private String avStudySponsorC;

	@Column(name="av_study_status__c")
	private String avStudyStatusC;

	@Column(name="av_study_type__c")
	private String avStudyTypeC;

	@Column(name="av_subject_age_lower_limit__c")
	private Double avSubjectAgeLowerLimitC;

	@Column(name="av_subject_age_lower_limit_unit__c")
	private String avSubjectAgeLowerLimitUnitC;

	@Column(name="av_subject_age_upper_limit__c")
	private Double avSubjectAgeUpperLimitC;

	@Column(name="av_subject_age_upper_limit_unit__c")
	private String avSubjectAgeUpperLimitUnitC;

	@Column(name="av_subject_gender__c")
	private String avSubjectGenderC;

	@Column(name="av_subject_type__c")
	private String avSubjectTypeC;

	@Column(name="av_targeted_safety_study_pass_study__c")
	private Boolean avTargetedSafetyStudyPassStudyC;

	@Column(name="av_type_of_program__c")
	private String avTypeOfProgramC;

	@Column(name="av_type_of_randomization__c")
	private String avTypeOfRandomizationC;

	@Column(name="av_vault_error_reason__c")
	private String avVaultErrorReasonC;

	@Column(name="av_vault_study_id__c")
	private String avVaultStudyIdC;

	@Column(name="av_vendor_managed__c")
	private Boolean avVendorManagedC;

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