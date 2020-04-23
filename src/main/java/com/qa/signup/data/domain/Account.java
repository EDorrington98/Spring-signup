package com.qa.signup.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private long id;

	private String firstName;
	private String lastName;
	private String accountNumber;

	public Account() {
		super();
	}

	public Account(String fName, String lName) {
		super();
		this.firstName = fName;
		this.lastName = lName;
		this.setAccountNumber(null);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
