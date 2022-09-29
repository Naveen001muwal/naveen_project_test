package com.greatlearning.CustomerRelationshipManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
       
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="FirstName")
       private String FirstName;
	
	@Column(name="LastName")
       private String LastName ;
	
	@Column(name="EmailId")
       private String EmailId ;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public Customer(String firstName, String lastName, String emailId) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.EmailId = emailId;
	}

	@Override
	public String toString() {
		return "Customer [FirstName=" + FirstName + ", LastName=" + LastName + ", EmailId=" + EmailId + "]";
	}

	

	   

}
