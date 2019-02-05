package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the contact database table.
 * 
 *
 */
@Data	
@Entity
@Table(name="contact")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	private String accountid;

	@Column(name="ag_personnel_id__c")
	private String agPersonnelIdC;

	@Column(name="av_skip_address_validation__c")
	private Boolean avSkipAddressValidationC;

	@Column(name="av_skip_email_validation__c")
	private Boolean avSkipEmailValidationC;

	@Column(name="av_state_code__c")
	private String avStateCodeC;

	@Column(name="av_state_province__c")
	private String avStateProvinceC;

	@Column(name="av_state_province_addrvalid__c")
	private String avStateProvinceAddrvalidC;

	@Column(name="av_unique_email__c")
	private String avUniqueEmailC;

	@Column(name="av_user_id__c")
	private String avUserIdC;

	@Column(name="department")
	private String department;

	@Column(name="description")
	private String description;

	@Column(name="email")
	private String email;

	@Column(name="firstname")
	private String firstname;

	@Column(name="lastname")
	private String lastname;

	@Column(name="mailingcity")
	private String mailingcity;

	@Column(name="mailingcountry")
	private String mailingcountry;

	@Column(name="mailinggeocodeaccuracy")
	private String mailinggeocodeaccuracy;

	@Column(name="mailingpostalcode")
	private String mailingpostalcode;

	@Column(name="mailingstate")
	private String mailingstate;

	@Column(name="mailingstreet")
	private String mailingstreet;

	@Column(name="middlename")
	private String middlename;

	@Column(name="mobilephone")
	private String mobilephone;

	@Column(name="phone")
	private String phone;

	@Column(name="salutation")
	private String salutation;

	@Column(name="title")
	private String title;

	@Column(name="createddate")
	private Timestamp createddate;

	@Column(name="isdeleted")
	private Boolean isdeleted;

	@Column(name="name")
	private String name;

	@Column(name="sfid")
	private String sfid;

	@Column(name="systemmodstamp")
	private Timestamp systemmodstamp;

}