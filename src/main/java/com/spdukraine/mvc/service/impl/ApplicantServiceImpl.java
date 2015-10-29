package com.spdukraine.mvc.service.impl;

import com.spdukraine.mvc.entity.Applicant;
import com.spdukraine.mvc.repository.ApplicantDao;
import com.spdukraine.mvc.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("applicantService")
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired

    private ApplicantDao applicantDao;

    @Override
    @Transactional
    public void insert(Applicant applicant) {
        applicantDao.insert(applicant);
    }

    @Override
    @Transactional
    public void delete(Applicant applicant) {
        applicantDao.delete(applicant);
    }

    @Override
    @Transactional
    public Applicant findApplicantById(int id) {
        return this.applicantDao.findApplicantById(id);
    }

    @Override
    @Transactional
    public void update(Applicant applicant) {
        applicantDao.update(applicant);
    }

    @Override
    @Transactional
    public List<Applicant> getAllApplicant() {
        return applicantDao.getAllApplicant();
    }
}
