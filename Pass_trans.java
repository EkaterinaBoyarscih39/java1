package com.cars;

import java.util.ArrayList;
import java.util.List;

public class Pass_trans extends Cars {
    public Pass_trans(String code_car, String reg_numbers, int car_mileage, int add_param) {
        super(code_car, reg_numbers, car_mileage, add_param);
        this.cost_fuel = 47.50;
        this.fuel = 11.5;
        this.type_cars = "пассажирский транспорт";
    }
    public List<Cars> car = new ArrayList<>();

    public static void addCar(String reg_numbers, String car_mileage, String add_param) {
        car.add(new Cars(reg_numbers, Integer.parseInt(car_mileage), Integer.parseInt(add_param)));
    }

    public double total_cost() {
        double total = 0;
        for(Cars car: this.car) {
            total += this.cost_fuel * this.fuel * car.car_mileage / 100.0;
        }
        return total;
    }
}
