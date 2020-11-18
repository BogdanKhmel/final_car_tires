package com.main.java.entity;

import java.util.Objects;

public class Car {
    private String carBrand;
    private String carModel;
    private int carYearManuf;
    private int Id;

    public Car(){};
    public Car(String carBrand, String carModel, int carYearManuf) {

        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYearManuf = carYearManuf;
    }
        public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYearManuf() {
        return carYearManuf;
    }

    public void setCarYearManuf(int carYearManuf) {
        this.carYearManuf = carYearManuf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carYearManuf == car.carYearManuf &&
                Id == car.Id &&
                Objects.equals(carBrand, car.carBrand) &&
                Objects.equals(carModel, car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, carYearManuf, Id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYearManuf=" + carYearManuf +
                ", Id=" + Id +
                '}';
    }
}

