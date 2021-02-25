package com.dk.service.impl;

import com.dk.mapper.CarTypeMapper;
import com.dk.pojo.CarType;
import com.dk.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Deacription TODO
 * @Author Lenovo
 * @Date 2020/12/5 10:39
 * @Version 1.0
 **/
@Service
public class CarTypeServiceImpl implements CarTypeService {

    @Autowired
    private CarTypeMapper carTypeMapper;

    @Override
    public List<CarType> getCarType() {
        return carTypeMapper.selectByExample(null);
    }
}

