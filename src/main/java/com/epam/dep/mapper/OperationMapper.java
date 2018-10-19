package com.epam.dep.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OperationMapper implements RowMapper<Operation> {
    public Operation mapRow(ResultSet resultSet, int i) throws SQLException {
        Operation operation = new Operation();
        operation.setOperation_id(resultSet.getString("operation_id"));
        operation.setOperation_type(resultSet.getString("operation_status"));
        operation.setTransfer_date(resultSet.getDate("transfer_date"));
        operation.setApprover_id(resultSet.getString("approver_id"));
        operation.setCarrier_id(resultSet.getString("carrier_id"));
        operation.setIs_success(resultSet.getBoolean("is_success"));

        return operation;
    }
}