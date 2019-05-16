package com.kwalit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private int yearModel;
    private String make;
    private int speed;

    // avoid this "No default constructor for entity"
    public Car() {
    }

    public Car(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearModel=" + yearModel +
                ", make='" + make + '\'' +
                ", speed=" + speed +
                '}';
    }

}
