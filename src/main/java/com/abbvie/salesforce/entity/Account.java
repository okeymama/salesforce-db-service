package com.abbvie.salesforce.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the account database table.
 * 
 */
@Data	
@Entity
@Table(name="account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="_hc_err")
	private String hcErr;

	@Column(name="_hc_lastop")
	private String hcLastop;

	@Column(name="accountnumber")
	private String accountnumber;

	@Column(name="billingcity")
	private String billingcity;

	@Column(name="billingcountry")
	private String billingcountry;

	@Column(name="billingpostalcode")
	private String billingpostalcode;

	@Column(name="billingstate")
	private String billingstate;

	@Column(name="billingstreet")
	private String billingstreet;

	@Column(name="createddate")
	private Timestamp createddate;

	@Column(name="description")
	private String description;

	@Column(name="fax")
	private String fax;

	@Column(name="industry")
	private String industry;

	@Column(name="isdeleted")
	private Boolean isdeleted;

	@Column(name="name")
	private String name;

	@Column(name="numberofemployees")
	private Integer numberofemployees;

	@Column(name="sfid")
	private String sfid;

	@Column(name="shippingcity")
	private String shippingcity;

	@Column(name="shippingcountry")
	private String shippingcountry;

	@Column(name="shippingpostalcode")
	private String shippingpostalcode;

	@Column(name="shippingstate")
	private String shippingstate;

	@Column(name="shippingstreet")
	private String shippingstreet;

	@Column(name="systemmodstamp")
	private Timestamp systemmodstamp;

}