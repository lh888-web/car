package com.dk.service.impl;

import com.dk.mapper.CarMapper;
import com.dk.pojo.Car;
import com.dk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Deacription TODO
 * @Author Lenovo
 * @Date 2020/12/5 8:43
 * @Version 1.0
 **/
@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;

    @Override
    public List<Car> getCar(String carName, Integer carType) {
        return carMapper.getCar(carName,carType);
    }

    @Override
    public int addCarInfo(Car car) {
        return carMapper.insertSelective(car);
    }

    @Override
    public Car toUpdate(Integer carId) {
        return carMapper.selectByPrimaryKey(carId);
    }

    @Override
    public int updateInfo(Car car) {
        return carMapper.updateByPrimaryKeySelective(car);
    }
}

