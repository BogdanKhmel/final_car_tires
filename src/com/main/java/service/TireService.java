package com.main.java.service;

import com.main.java.bl.GetCurrentSeason;
import com.main.java.bl.Util;
import com.main.java.dao.TireDAO;
import com.main.java.entity.Tire;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TireService extends Util implements TireDAO {

    Connection connection = getConnection();




    @Override
    public void add(Tire tire) {

    }

    @Override
    public List<Tire> getAll() {
        return null;
    }

    @Override
    public List<Tire> getByCar(String carBrand,String carModel,int carYear) throws SQLException {
            List<Tire> tireList = new ArrayList<>();
            GetCurrentSeason getCurrentSeason = new GetCurrentSeason();


            PreparedStatement preparedStatement = null;

            String sql = "select t.brand,t.model,t.size, t.season,t.year from cars c left join car_tires ct on ct.car_id=c.id left join tires t on ct.tire_id=t.id where c.car_brand =? AND c.model = ? AND c.year=? AND t.season = ? ";

            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, carBrand);
                preparedStatement.setString(2, carModel);
                preparedStatement.setInt(3,carYear);
                preparedStatement.setString(4, getCurrentSeason.getCurrentSeason());


                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    Tire tire = new Tire();

                    tire.setTireBrand(resultSet.getString("brand"));

                    tire.setTireModel(resultSet.getString("model"));

                    tire.setTireSize(resultSet.getString("size"));

                    tire.setSeason(resultSet.getString("season"));

                    tire.setTireYearManuf(resultSet.getInt("year"));


                    tireList.add(tire);

                }

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
            return tireList;
        }


    @Override
    public Tire getById(int id) {
        return null;
    }

    @Override
    public Tire getByTireModel(String carModel) {
        return null;
    }

    @Override
    public Tire getByTireBrand(String carBrand) {
        return null;
    }

    @Override
    public Tire getByTireSize(String carSyze) {
        return null;
    }

    @Override
    public void update(Tire tire) {

    }

    @Override
    public void remove(Tire tire) {

    }

}

