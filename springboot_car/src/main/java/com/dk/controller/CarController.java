package com.dk.controller;

import com.dk.pojo.Car;
import com.dk.pojo.CarType;
import com.dk.service.CarService;
import com.dk.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Deacription TODO
 * @Author Lenovo
 * @Date 2020/12/5 8:42
 * @Version 1.0
 **/
@Controller
@RequestMapping("carController")
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private CarTypeService carTypeService;

    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("getCar")
    @ResponseBody
    public List<Car> getCar(String carName,Integer carType){
        List<Car> cars = carService.getCar(carName,carType);
        return cars;
    }

    @RequestMapping("toCarAdd")
    public String toCarAdd(Model model){
        List<CarType> carTypes = carTypeService.getCarType();
        model.addAttribute("ct",carTypes);
        return "carAdd";
    }

    @RequestMapping("addCarInfo")
    @ResponseBody
    public boolean addCarInfo(Car car){
        try {
            int i = carService.addCarInfo(car);
            return i > 0;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("toUpdate")
    public String toUpdate(Model model,Integer carId){
        List<CarType> carTypes = carTypeService.getCarType();
        model.addAttribute("ct",carTypes);
        Car cars = carService.toUpdate(carId);
        model.addAttribute("c",cars);
        return "carUpdate";
    }

    @RequestMapping("updateInfo")
    @ResponseBody
    public boolean updateInfo(Car car){
        try {
            int i = carService.updateInfo(car);
            return i > 0;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}

