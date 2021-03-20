package com.ajt.hm.model;

import java.io.Serializable;

public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer docId;
	private String docName;
	private String docMail;
	private String docMobile;
	private String docAddrs;
	private String specialist;

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocMail() {
		return docMail;
	}

	public void setDocMail(String docMail) {
		this.docMail = docMail;
	}

	public String getDocMobile() {
		return docMobile;
	}

	public void setDocMobile(String docMobile) {
		this.docMobile = docMobile;
	}

	public String getDocAddrs() {
		return docAddrs;
	}

	public void setDocAddrs(String docAddrs) {
		this.docAddrs = docAddrs;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

}
