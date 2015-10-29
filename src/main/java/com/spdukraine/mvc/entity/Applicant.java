package com.spdukraine.mvc.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="applicant_id")
    private Long applicantId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "skype")
    private String skype;

    public Applicant() {
    }

    public Applicant(String firstName, String lastName, String email, String skype) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.skype = skype;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }
}
