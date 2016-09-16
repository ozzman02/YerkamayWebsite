package com.yerkamay.web.commands;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class ConferenceCommand {
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String phone;
	
	@Email
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String organization;
	
	@NotEmpty
	private String conferenceType;
	
	@NotEmpty
	private String place;
	
	@NotEmpty
	private String equipment;
	
	@NotEmpty
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getConferenceType() {
		return conferenceType;
	}

	public void setConferenceType(String conferenceType) {
		this.conferenceType = conferenceType;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
