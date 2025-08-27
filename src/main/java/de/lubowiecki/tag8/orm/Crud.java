package de.lubowiecki.tag8.orm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Crud<T> {

    List<T> find() throws SQLException;

    T find(int id) throws SQLException;

    boolean insert(T obj) throws SQLException;

    boolean update(T obj) throws SQLException;

    boolean delete(T obj) throws SQLException;

    boolean deleteById(int id) throws SQLException;

    T fill(ResultSet result) throws SQLException;
}
