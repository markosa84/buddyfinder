package hu.ak_akademia.buddyfinder.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Person {
	private int personID;
	private Gender gender;
	private String userName;
	private String email;
	private LocalDate dateOfBirth;
	private int orientationId;
	private Timestamp lastOnline;
	private boolean smoker;
	private Status status;
	private int cityId;
	private String introduction;
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getOrientationId() {
		return orientationId;
	}
	public void setOrientationId(int orientationId) {
		this.orientationId = orientationId;
	}
	public Timestamp getLastOnline() {
		return lastOnline;
	}
	public void setLastOnline(Timestamp lastOnline) {
		this.lastOnline = lastOnline;
	}
	public boolean isSmoker() {
		return smoker;
	}
	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Person() {

	}
	public Person(int personID, Gender gender, String userName, String email, LocalDate dateOfBirth, int orientationId,
			Timestamp lastOnline, boolean smoker, Status status, int cityId, String introduction) {

		this.personID = personID;
		this.gender = gender;
		this.userName = userName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.orientationId = orientationId;
		this.lastOnline = lastOnline;
		this.smoker = smoker;
		this.status = status;
		this.cityId = cityId;
		this.introduction = introduction;
	}
	
	
}
