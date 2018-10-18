package com.epam.dep.service;

import com.epam.dep.entity.Agency;

import java.io.IOException;
import java.util.List;

public interface AgencyService {

    Agency getAgencyById (String id) throws IOException;

    List<Agency> findAll();
}
