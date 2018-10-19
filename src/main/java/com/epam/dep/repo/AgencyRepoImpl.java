package com.epam.dep.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;


@Repository
public class AgencyRepoImpl implements AgencyRepo {

    @Autowired
    public BoxAgencyRead boxAgencyRead;

    public String getAgencyById(String id) throws IOException {

        return null;
    }

    public List<Agency> findAll() {
        return null;
    }
}
