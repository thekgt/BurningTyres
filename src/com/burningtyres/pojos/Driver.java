package com.burningtyres.pojos;

import java.util.Date;

import javax.persistence.Column;

import com.mysql.jdbc.Blob;

public class Driver extends Person {

	
	private Blob image;
	private String lic_no;
	private Date licenceExpiryDate;
	private String note;
	
	
	
	@Column(name="image")
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	
	@Column(name="lic_no")
	public String getLic_no() {
		return lic_no;
	}
	public void setLic_no(String lic_no) {
		this.lic_no = lic_no;
	}
	
	@Column(name="exp")
	public Date getLicenceExpiryDate() {
		return licenceExpiryDate;
	}
	public void setLicenceExpiryDate(Date licenceExpiryDate) {
		this.licenceExpiryDate = licenceExpiryDate;
	}
	
	@Column(name="note")
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
