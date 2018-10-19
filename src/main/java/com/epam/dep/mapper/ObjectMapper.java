package com.epam.dep.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ObjectMapper implements RowMapper<Object> {
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Object object = new Object();
        object.setObject_id(resultSet.getNString("object_id"));
        object.setObject_type(resultSet.getNString("object_type"));
        object.setObject_owner(resultSet.getNString("object_owner"));
        object.setEnterprise_id(resultSet.getNString("enterprise_id"));
        object.setBoxupload_date(resultSet.getDate("boxupload_date"));
        object.setBox_version(resultSet.getNString("box_version"));
        object.setCurrent_version(resultSet.getNString("current_version"));
        object.setCurrent_location(resultSet.getNString("current_location"));

        return object;
    }
}
