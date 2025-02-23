package com.example.demo;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "First Name is required")
	private String firstName;

	@NotBlank(message = "Last Name is required")
	private String lastName;

	@NotBlank(message = "Company is required")
	private String company;

	@NotBlank(message = "Address is required")
	private String address;

	private String city;

	@NotBlank(message = "State is required")
	private String state;

	@NotBlank(message = "Country is required")
	private String country;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;

	@NotBlank(message = "Phone Number is required")
	@Size(min = 10, max = 15, message = "Phone number must be between 10-15 characters")
	private String phoneNumber;

	@NotBlank(message = "Meal Preference is required")
	private String mealPreference;

	@ElementCollection
	private List<String> paymentModes;

	private String ddChequeNo;
	private String drawnOn;
	private String payableAt;

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMealPreference() {
		return mealPreference;
	}

	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
	}

	public List<String> getPaymentModes() {
		return paymentModes;
	}

	public void setPaymentModes(List<String> paymentModes) {
		this.paymentModes = paymentModes;
	}

	public String getDdChequeNo() {
		return ddChequeNo;
	}

	public void setDdChequeNo(String ddChequeNo) {
		this.ddChequeNo = ddChequeNo;
	}

	public String getDrawnOn() {
		return drawnOn;
	}

	public void setDrawnOn(String drawnOn) {
		this.drawnOn = drawnOn;
	}

	public String getPayableAt() {
		return payableAt;
	}

	public void setPayableAt(String payableAt) {
		this.payableAt = payableAt;
	}
}
