package com.main.java.dao;


import com.main.java.entity.TireForCar;

import java.sql.SQLException;
import java.util.List;


public interface TireForCarDAO {

        // create
        void add(TireForCar tireForCar);

        //read
        List<TireForCar> getAll();


        TireForCar getByCarIdTireId(int carId, int tireId) throws SQLException;


        //update
        void update(TireForCar tireForCar);

        //delete
        void remove(TireForCar tireForCar) throws SQLException;

}