package com.main.java.entity;

public class TireForCar {
    private int tireForCarId;
    private int carId;
    private int tireId;

    public TireForCar(){}
    public TireForCar(int carId, int tireId) {

        this.carId = carId;
        this.tireId = tireId;
    }

    public int getTireForCarId() {
        return tireForCarId;
    }

    public void setTireForCarId(int tireForCarId) {
        this.tireForCarId = tireForCarId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getTireId() {
        return tireId;
    }

    public void setTireId(int tireId) {
        this.tireId = tireId;
    }
}
