package com.integration.model;

import java.util.Date;

public class EmployeeITS {
    private Long id;
    private String pinpp;
    private String passwordSerial;
    private String pNumber;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String middleName;
    private Gender gender;
    private Long jhsId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPinpp() {
        return pinpp;
    }

    public void setPinpp(String pinpp) {
        this.pinpp = pinpp;
    }

    public String getPasswordSerial() {
        return passwordSerial;
    }

    public void setPasswordSerial(String passwordSerial) {
        this.passwordSerial = passwordSerial;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getJhsId() {
        return jhsId;
    }

    public void setJhsId(Long jhsId) {
        this.jhsId = jhsId;
    }
}
