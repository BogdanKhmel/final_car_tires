package com.main.java.entity;

import java.util.Objects;

public class Tire {
    private String tireBrand;
    private String tireModel;
    private String tireSize;
    private String season;
    private int tireYearManuf;
    private int Id;
    public Tire(){};
    public Tire(String tireBrand, String tireModel, String tireSize, String season, int tireYearManuf) {
        this.tireBrand = tireBrand;
        this.tireModel = tireModel;
        this.tireSize = tireSize;
        this.season = season;
        this.tireYearManuf = tireYearManuf;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }

    public String getTireModel() {
        return tireModel;
    }

    public void setTireModel(String tireModel) {
        this.tireModel = tireModel;
    }

    public String getTireSize() {
        return tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getTireYearManuf() {
        return tireYearManuf;
    }

    public void setTireYearManuf(int tireYearManuf) {
        this.tireYearManuf = tireYearManuf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tire tire = (Tire) o;
        return tireYearManuf == tire.tireYearManuf &&
                Id == tire.Id &&
                tireBrand.equals(tire.tireBrand) &&
                tireModel.equals(tire.tireModel) &&
                tireSize.equals(tire.tireSize) &&
                season.equals(tire.season);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tireBrand, tireModel, tireSize, season, tireYearManuf, Id);
    }

    @Override
    public String toString() {
        return
                "Brand: " + tireBrand + "   Model:   " + tireModel  + "   Size:    " + tireSize + "   Season:  " + season  + "   Year:    " + tireYearManuf;

    }
}
