package com.main.java.service;

import com.main.java.bl.Util;
import com.main.java.dao.TireForCarDAO;
import com.main.java.entity.TireForCar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TireForCarService extends Util implements TireForCarDAO {
    private Connection connection = getConnection();

    @Override
    public void add(TireForCar tireForCar) {

    }

    @Override
    public List<TireForCar> getAll() {
        return null;
    }

    @Override
    public TireForCar getByCarIdTireId(int carId, int tireId) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT car_id, tire_id FROM car_tires WHERE car_id=? AND tire_id=?";
        TireForCar tireForCar = new TireForCar();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, carId);
            preparedStatement.setInt(2, tireId);

            ResultSet resultSet = preparedStatement.executeQuery();
            tireForCar.setCarId(resultSet.getInt("car_id"));
            tireForCar.setTireId(resultSet.getInt("tire_id"));
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }


        }
        return tireForCar;
    }



    @Override
        public void update (TireForCar tireForCar){

        }

        @Override
        public void remove (TireForCar tireForCar) throws SQLException {
            PreparedStatement preparedStatement = null;
            String sql = "DELETE FROM car_tires WHERE id = ? ";
            try {
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setInt(1, tireForCar.getCarId());

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }




}