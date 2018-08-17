package com.viavis.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="T_USER")
@XmlRootElement
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="userSequenceGen")
	@SequenceGenerator(name="userSequenceGen",sequenceName="USER_SEQUENCE")
	private Long 	id;
	
	@Column(name="NAME")
	private String 	name;
	
	@Column(name="PHONENUMBER")
	private String 	phoneNumber;
	
	@Column(name="ADRESS")
	private String  address;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
