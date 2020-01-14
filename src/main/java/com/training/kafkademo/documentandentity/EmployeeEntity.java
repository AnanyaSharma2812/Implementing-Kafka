package com.training.kafkademo.documentandentity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEE")
<<<<<<< HEAD

public class EmployeeEntity
{
=======
public class EmployeeEntity {
>>>>>>> 123addedf82675d1014ce8c111af794937604a10
    String firstName ;
    String lastName ;

    Date dateOfBirth ;

    double experience ;

    public EmployeeEntity()
    { }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
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
