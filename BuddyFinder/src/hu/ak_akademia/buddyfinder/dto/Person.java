package hu.ak_akademia.buddyfinder.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Person {
	private Integer personID;
	private Gender gender;
	private String userName;
	private String email;
	private LocalDate dateOfBirth;
	private Integer orientationId;
	private Timestamp lastOnline;
	private Boolean smoker;
	private Status status;
	private Integer cityId;
	private String introduction;
	
	public Person() {
	
	}

	public Person(Integer personID, Gender gender, String userName, String email, LocalDate dateOfBirth,
			Integer orientationId, Timestamp lastOnline, Boolean smoker, Status status, Integer cityId,
			String introduction) {
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

	public Integer getPersonID() {
		return personID;
	}

	public void setPersonID(Integer personID) {
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

	public Integer getOrientationId() {
		return orientationId;
	}

	public void setOrientationId(Integer orientationId) {
		this.orientationId = orientationId;
	}

	public Timestamp getLastOnline() {
		return lastOnline;
	}

	public void setLastOnline(Timestamp lastOnline) {
		this.lastOnline = lastOnline;
	}

	public Boolean getSmoker() {
		return smoker;
	}

	public void setSmoker(Boolean smoker) {
		this.smoker = smoker;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
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
		result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((introduction == null) ? 0 : introduction.hashCode());
		result = prime * result + ((lastOnline == null) ? 0 : lastOnline.hashCode());
		result = prime * result + ((orientationId == null) ? 0 : orientationId.hashCode());
		result = prime * result + ((personID == null) ? 0 : personID.hashCode());
		result = prime * result + ((smoker == null) ? 0 : smoker.hashCode());
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
		if (cityId == null) {
			if (other.cityId != null) {
				return false;
			}
		} else if (!cityId.equals(other.cityId)) {
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
		if (orientationId == null) {
			if (other.orientationId != null) {
				return false;
			}
		} else if (!orientationId.equals(other.orientationId)) {
			return false;
		}
		if (personID == null) {
			if (other.personID != null) {
				return false;
			}
		} else if (!personID.equals(other.personID)) {
			return false;
		}
		if (smoker == null) {
			if (other.smoker != null) {
				return false;
			}
		} else if (!smoker.equals(other.smoker)) {
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