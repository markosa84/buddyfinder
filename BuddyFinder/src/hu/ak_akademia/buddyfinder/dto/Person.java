package hu.ak_akademia.buddyfinder.dto;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private Integer personID;
    private Gender gender;
    private String userName;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private Integer orientationId;
    private Timestamp lastOnline;
    private Boolean smoker;
    private Status status;
    private Integer cityId;
    private String introduction;

    public Person() {
    }

    public Person(Integer personID, Gender gender, String userName, String email, String password, LocalDate dateOfBirth, Integer orientationId, Timestamp lastOnline, Boolean smoker, Status status,
            Integer cityId, String introduction) {
        this.personID = personID;
        this.gender = gender;
        this.userName = userName;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return Objects.hash(cityId, dateOfBirth, email, gender, introduction, lastOnline, orientationId, password, personID, smoker, status, userName);
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
        return Objects.equals(cityId, other.cityId) && Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email) && gender == other.gender
                && Objects.equals(introduction, other.introduction) && Objects.equals(lastOnline, other.lastOnline) && Objects.equals(orientationId, other.orientationId)
                && Objects.equals(password, other.password) && Objects.equals(personID, other.personID) && Objects.equals(smoker, other.smoker) && status == other.status
                && Objects.equals(userName, other.userName);
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
        builder.append(", password=");
        builder.append(password);
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