package com.spdukraine.mvc.repository;


import com.spdukraine.mvc.entity.Applicant;

import java.util.List;

public interface ApplicantDao {
    void insert(Applicant applicant);
    void delete(Applicant applicant);
    Applicant findApplicantById(int id);
    void update(Applicant applicant);
    List<Applicant> getAllApplicant();
}
