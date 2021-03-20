package com.ajt.hm.model;

import java.io.Serializable;
import java.util.ArrayList;

public class HospitalType implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer hospTypeId;
	private String hospType;
	private ArrayList<Hospital> hospitals;

	public Integer getHospTypeId() {
		return hospTypeId;
	}

	public void setHospTypeId(Integer hospTypeId) {
		this.hospTypeId = hospTypeId;
	}

	public String getHospType() {
		return hospType;
	}

	public void setHospType(String hospType) {
		this.hospType = hospType;
	}

	public ArrayList<Hospital> getHospitals() {
		return hospitals;
	}

	public void setHospitals(ArrayList<Hospital> hospitals) {
		this.hospitals = hospitals;
	}

}
