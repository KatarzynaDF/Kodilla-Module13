package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LookingFacade {

    @Autowired
    private Company company;

    //@Autowired

    //private CompanyDao companyDao;

    @Autowired
    private Employee employee;

    private static final Logger LOGGER = LoggerFactory.getLogger(LookingFacade.class);

    public void lookingForCompany(final Company company) throws LookingProcessException {
        if (company.getName().isEmpty()) {

            LOGGER.error(LookingProcessException.COMPANY_DOES_NOT_EXIST);
            throw new LookingProcessException(LookingProcessException.COMPANY_DOES_NOT_EXIST);
        }

    }

}

