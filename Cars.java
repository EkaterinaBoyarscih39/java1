package com.cars;

public class Cars {
    public String code_cars;//Код транспортного средства
    public String reg_numbers;//Гос.номер
    public int car_mileage;//Пробег
    public String add_param;//Доп.параметр
    public double cost_fuel;//Стоимость литра топлив
    public double fuel;//Расход топлива

    public Cars(int car_mileage, double cost_fuel, double fuel) {
        this.car_mileage = car_mileage;
        this.cost_fuel = cost_fuel;
        this.fuel = fuel;
    }

    public Cars(double cost_fuel, double fuel) {
    }

    public double full_cost() {
        //Затрачено на ГСМ за всё время использования
        return car_mileage/100 * cost_fuel * fuel;
    }
}
