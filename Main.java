package com.cars;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] input_values = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50",
                "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29",
                "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        input_values = input_values.replaceAll("_", "-");
        String[] param_cars = input_values.split("-");

    }
}