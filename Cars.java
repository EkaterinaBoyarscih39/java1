package com.cars;

public class Cars {
    public String code_car;//Код транспортного средства
    public String reg_numbers;//Гос.номер
    public int car_mileage;//Пробег
    public int add_param;//Доп.параметр
    public double cost_fuel;//Стоимость литра топлив
    public double fuel;//Расход топлива
    public String type_cars;//Тип авто
    public Cars(String code_car, String reg_numbers, int car_mileage, int add_param) {
        this.code_car = code_car;
        this.reg_numbers = reg_numbers;
        this.car_mileage = car_mileage;
        this.add_param = add_param;
    }

}

