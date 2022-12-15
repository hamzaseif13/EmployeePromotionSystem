package com.example.employeepromotionsystem.dao;

import com.example.employeepromotionsystem.config.DatabaseConnection;
import com.example.employeepromotionsystem.models.Employee;
import com.example.employeepromotionsystem.models.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class EmployeeDao implements IDao<Employee> {

    private final Connection connection = DatabaseConnection.getInstance().getConnection();

    @Override
    public Collection<Employee> getAll() throws SQLException {
        String sql = "select * from employee,role where employee.role_id=role.id";
        Collection<Employee> employees = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Employee employee = new Employee(set.getInt("id"),
                        set.getString("first_name"),
                        set.getString("last_name"),
                        set.getDouble("salary"),
                        set.getString("email"),
                        set.getInt("employee_rank"),
                        set.getDate("hire_date"),
                        set.getString("job_title"),
                        getRole(set.getString("name")),
                        null, set.getString("password")
                );
                employees.add(employee);
            }
            return employees;
        } catch (SQLException e) {
            throw e;
        }

    }

    private Role getRole(String s) {
        switch (s) {
            case "manager":
                return Role.MANAGER;
            case "employee":
                return Role.EMPLOYEE;
            case "vp":
                return Role.VP;
            case "director":
                return Role.DIRECTOR;
            case "president":
                return Role.PRESIDENT;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Employee getById(int id) throws SQLException {
        return null;
    }
    public Employee getByEmail(String email){
        return null;
    }
    @Override
    public Employee save(Employee obj) throws SQLException {
        return null;
    }

    @Override
    public Employee update(Employee obj) throws SQLException {
        return null;
    }
}
