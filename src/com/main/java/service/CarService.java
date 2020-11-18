package com.main.java.service;

import com.main.java.bl.Util;
import com.main.java.dao.CarDAO;
import com.main.java.entity.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarService extends Util implements CarDAO {

    Connection connection = getConnection();

    @Override
    public void add(Car car) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO cars (car_brand,model,year) VALUES (?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, car.getCarBrand());
            preparedStatement.setString(2, car.getCarModel());
            preparedStatement.setInt(3, car.getCarYearManuf());

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

    @Override
    public List<Car> getAll() throws SQLException {
        List<Car> CarList = new ArrayList<>();
        Statement statement = null;
        String sql = "SELECT id,car_brand,model,year FROM cars";
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Car car = new Car();
                car.setId(resultSet.getInt("id"));
                car.setCarBrand(resultSet.getString("car_brand"));
                car.setCarModel(resultSet.getString("model"));
                car.setCarYearManuf(resultSet.getInt("year"));
                CarList.add(car);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

            return CarList;
        }

        }



    @Override
    public Car getById(int id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT id,car_brand,model,year FROM cars WHERE id=?";

        Car car = new Car();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            car.setId(resultSet.getInt("id"));
            car.setCarBrand(resultSet.getString("car_brand"));
            car.setCarModel(resultSet.getString("model"));
            car.setCarYearManuf(resultSet.getInt("year"));


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
        return car;
    }

    @Override
        public void update (Car car) throws SQLException {
            PreparedStatement preparedStatement = null;
            String sql = "UPDATE cars SET car_brand=?,model=?,year=? WHERE id = ? ";
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, car.getCarBrand());
                preparedStatement.setString(2, car.getCarModel());
                preparedStatement.setInt(3, car.getCarYearManuf());
                preparedStatement.setInt(4, car.getId());

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

        @Override
        public void remove (Car car) throws SQLException {
            PreparedStatement preparedStatement = null;
            String sql = "DELETE FROM cars WHERE id = ? ";
            try {
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setInt(1, car.getId());

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
