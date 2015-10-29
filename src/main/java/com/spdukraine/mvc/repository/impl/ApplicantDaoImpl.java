package com.spdukraine.mvc.repository.impl;


import com.spdukraine.mvc.entity.Applicant;
import com.spdukraine.mvc.repository.ApplicantDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("applicantDao")
public class ApplicantDaoImpl implements ApplicantDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Applicant applicant) {
        sessionFactory.getCurrentSession().save(applicant);
    }

    @Override
    public void delete(Applicant applicant) {
        sessionFactory.getCurrentSession().delete(applicant);
    }

    @Override
    public Applicant findApplicantById(int id) {
        return (Applicant) this.sessionFactory.getCurrentSession().get(Applicant.class, id);
    }

    @Override
    public void update(Applicant applicant) {
        sessionFactory.getCurrentSession().update(applicant);
    }

    @Override
    public List<Applicant> getAllApplicant() {
        return this.sessionFactory.getCurrentSession().createCriteria(Applicant.class).list();
    }
}
