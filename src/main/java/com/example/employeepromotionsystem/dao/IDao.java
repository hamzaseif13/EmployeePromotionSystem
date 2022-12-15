package com.example.employeepromotionsystem.dao;

import java.sql.SQLException;
import java.util.Collection;

public interface IDao<T> {
    Collection<T> getAll() throws SQLException;
    T getById(int id) throws SQLException;
    T save(T obj) throws SQLException;
    T update (T obj) throws SQLException;

}
