package com.epam.dep.service;

import com.epam.dep.entity.Agency;
import com.epam.dep.repo.AgencyRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class AgencyServiceImpl implements AgencyService {

    @Autowired
    public AgencyRepo agencyRepo;

    @Override
    public Agency getAgencyById(String id) throws IOException {
        return null;
    }

    @Override
    public List<Agency> findAll() {
        return null;
    }

}

