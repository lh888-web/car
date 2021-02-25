package com.dk.service;

import com.dk.pojo.Car;

import java.util.List;

public interface CarService {
    List<Car> getCar(String carName, Integer carType);

    int addCarInfo(Car car);

    Car toUpdate(Integer carId);

    int updateInfo(Car car);
}
