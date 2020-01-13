package com.training.kafkademo.documentandentity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class EmployeeDocument
{
    String firstName ;
    String lastName ;

    Date dateOfBirth ;

    double experience ;

    public EmployeeDocument()
    { }

    @Override
    public String toString() {
        return "EmployeeDocument{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", experience=" + experience +
                '}';
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
