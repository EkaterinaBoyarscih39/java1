package com.cars;

import com.cars.Pass_car;
import com.cars.Pass_trans;
import com.cars.Truck;
import com.cars.Heavy_mach;
import java.util.*;

import static com.cars.Pass_car.*;

public class Main {
    public static void main(String[] args) {
        String[] input_values = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50",
                "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29",
                "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        Pass_car Passc = new Pass_car();
        Pass_trans Passtr = new Pass_trans();

        for(String i: input_values){
            String[] car_info = i.replace("_", "-").split("-");
            if(car_info.length > 3) {
                switch (car_info[0]){
                    case "C100":
                        Pass_car.addCar(car_info[1], car_info[2]);
                    case "C200":
                        Truck.addCar(car_info[1], car_info[2], car_info[3]);
                    case "C300":
                        Pass_trans.addCar(car_info[1], car_info[2], car_info[3]);
                    case "C400":
                        Heavy_mach.addCar(car_info[1], car_info[2], car_info[3]);
                }
            }
        }

        System.out.println(Pass_car.total_cost());
    }
}
