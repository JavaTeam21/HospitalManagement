package com.ajt.hm.model;

import java.io.Serializable;

public class Hospital implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer hospId;
	private String hospLoc;
	private HospitalType hospitalType;
	private Doctor doctor;

	public Integer getHospId() {
		return hospId;
	}

	public void setHospId(Integer hospId) {
		this.hospId = hospId;
	}

	public String getHospLoc() {
		return hospLoc;
	}

	public void setHospLoc(String hospLoc) {
		this.hospLoc = hospLoc;
	}

	public HospitalType getHospitalType() {
		return hospitalType;
	}

	public void setHospitalType(HospitalType hospitalType) {
		this.hospitalType = hospitalType;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
