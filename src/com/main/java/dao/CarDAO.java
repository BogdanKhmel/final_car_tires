package com.main.java.dao;

import com.main.java.entity.Car;

import java.sql.SQLException;
import java.util.List;

public interface CarDAO {
    // create
    void add(Car car) throws SQLException;

    //read
    List<Car> getAll() throws SQLException;

    Car getById(int id) throws SQLException;

    //update
    void update(Car car) throws SQLException;


    //delete
    void remove(Car car) throws SQLException;


}
