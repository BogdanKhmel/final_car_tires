package com.main.java.dao;


import com.main.java.entity.Tire;

import java.sql.SQLException;
import java.util.List;

public interface TireDAO {
    // create
    void add(Tire tire);

    //read
    List<Tire> getAll();
    public List<Tire> getByCar (String carBrand,String carModel,int carYear) throws SQLException;

    Tire getById(int id);
    Tire getByTireModel(String carModel);
    Tire getByTireBrand(String carBrand);
    Tire getByTireSize(String carSize);

    //update
    void update(Tire tire);

    //delete
    void remove(Tire tire);

}
