package com.ajt.hm.model;

import java.io.Serializable;

public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer patId;
	private String patName;
	private String patMail;
	private String patMobile;
	private String patAddrs;
	private Integer patAge;
	private String desease;
	private Hospital hospital;
	private Doctor doctor;

	public Integer getPatId() {
		return patId;
	}

	public void setPatId(Integer patId) {
		this.patId = patId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getPatMail() {
		return patMail;
	}

	public void setPatMail(String patMail) {
		this.patMail = patMail;
	}

	public String getPatMobile() {
		return patMobile;
	}

	public void setPatMobile(String patMobile) {
		this.patMobile = patMobile;
	}

	public String getPatAddrs() {
		return patAddrs;
	}

	public void setPatAddrs(String patAddrs) {
		this.patAddrs = patAddrs;
	}

	public Integer getPatAge() {
		return patAge;
	}

	public void setPatAge(Integer patAge) {
		this.patAge = patAge;
	}

	public String getDesease() {
		return desease;
	}

	public void setDesease(String desease) {
		this.desease = desease;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
