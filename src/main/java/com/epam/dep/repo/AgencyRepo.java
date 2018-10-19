package com.epam.dep.repo;

import java.io.IOException;
import java.util.List;

public interface AgencyRepo {

    String getAgencyById (String id) throws IOException;

    List<Agency> findAll();
}
