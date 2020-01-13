package com.training.kafkademo.dto;

import java.util.Date;

public class EmployeeDTO
{

    String firstName ;
    String lastName ;
    Date dateOfBirth ;
    double experience ;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getExperience() {
        return experience;
    }
}
