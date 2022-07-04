package com.ty.person;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Person {


	private String name;
	private String dob;
	private String gender;
	

	@EmbeddedId
 private PersonId personId;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public PersonId getPersonId() {
		return personId;
	}
	public void setPersonId(PersonId personId) {
		this.personId = personId;
	}
	
	
}
