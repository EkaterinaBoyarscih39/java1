package com.cars;

import java.util.ArrayList;
import java.util.List;

public class Pass_car extends Cars {
    public Pass_car(String code_car, String reg_numbers, int car_mileage, int add_param) {
        super(code_car, reg_numbers, car_mileage, add_param);
        this.cost_fuel = 46.10;
        this.fuel = 12.5;
        this.type_cars = "легковой авто";
        }

    private static List<Cars> car = new ArrayList<>();

    public static void addCar(String reg_numbers, String car_mileage) {
        car.add(new Cars(reg_numbers, Integer.parseInt(car_mileage)));
    }

    public double total_cost() {
        double total = 0;
        for(Cars car: this.car) {
            total += this.cost_fuel * this.fuel * car.car_mileage / 100.0;
        }
        return total;
    }
}
