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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cityId;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((introduction == null) ? 0 : introduction.hashCode());
		result = prime * result + ((lastOnline == null) ? 0 : lastOnline.hashCode());
		result = prime * result + orientationId;
		result = prime * result + personID;
		result = prime * result + (smoker ? 1231 : 1237);
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (cityId != other.cityId) {
			return false;
		}
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null) {
				return false;
			}
		} else if (!dateOfBirth.equals(other.dateOfBirth)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (gender != other.gender) {
			return false;
		}
		if (introduction == null) {
			if (other.introduction != null) {
				return false;
			}
		} else if (!introduction.equals(other.introduction)) {
			return false;
		}
		if (lastOnline == null) {
			if (other.lastOnline != null) {
				return false;
			}
		} else if (!lastOnline.equals(other.lastOnline)) {
			return false;
		}
		if (orientationId != other.orientationId) {
			return false;
		}
		if (personID != other.personID) {
			return false;
		}
		if (smoker != other.smoker) {
			return false;
		}
		if (status != other.status) {
			return false;
		}
		if (userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else if (!userName.equals(other.userName)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [personID=");
		builder.append(personID);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", orientationId=");
		builder.append(orientationId);
		builder.append(", lastOnline=");
		builder.append(lastOnline);
		builder.append(", smoker=");
		builder.append(smoker);
		builder.append(", status=");
		builder.append(status);
		builder.append(", cityId=");
		builder.append(cityId);
		builder.append(", introduction=");
		builder.append(introduction);
		builder.append("]");
		return builder.toString();
	}
	
}
