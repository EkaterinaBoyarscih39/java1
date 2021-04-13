package com.cars;

public class TypeofCars {
    public class Pass_car extends Cars {
        //public String type_cars;

        public Pass_car(double cost_fuel, double fuel, String type_cars) {
            super(cost_fuel, fuel);
            this.cost_fuel = 46.10;
            this.fuel = 12.5;
            this.type_cars = "легковой авто";
        }
    }

    public class Truck extends Cars {
        //public String type_cars;

        public Truck(double cost_fuel, double fuel, String type_cars) {
            super(cost_fuel, fuel);
            this.cost_fuel = 48.90;
            this.fuel = 12.0;
            this.type_cars = "грузовой авто";
        }
    }

    public class Pass_trans extends Cars {
        //public String type_cars;

        public Pass_trans(double cost_fuel, double fuel, String type_cars) {
            super(cost_fuel, fuel);
            this.cost_fuel = 47.50;
            this.fuel = 11.5;
            this.type_cars = "пассажирский транспорт";
        }
    }

    public class Heavy_mach extends Cars {
        //public String type_cars;

        public Heavy_mach(double cost_fuel, double fuel, String type_cars) {
            super(cost_fuel, fuel);
            this.cost_fuel = 48.90;
            this.fuel = 20.0;
            this.type_cars = "тяжелая техника(краны)";
        }
    }
}

