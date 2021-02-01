package com.auto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Car extends Auto {
    double engSize;

    Car(double engSize) {
        this.engSize = engSize;
    }

    void moneyConsumption() {
        double fuelConsumption100km = 8.56;
        double oneLiterCost = 23.35;
        BigDecimal money = BigDecimal.valueOf(fuelConsumption100km * oneLiterCost).setScale(2, RoundingMode.HALF_UP);

        System.out.println("driving 100 km will be cost " + money + " UAH per 100 km" + '\n');
    }
}
