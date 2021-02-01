package com.auto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ElectroCar extends Car {

    ElectroCar(double engSize) {
    super(engSize);
    }

    @Override
    void moneyConsumption() {
        double kWperHourCost = 1.68;
        BigDecimal money = BigDecimal.valueOf(engSize * kWperHourCost * 1.4).setScale(2, RoundingMode.HALF_UP);

        System.out.println("driving 100 km will be cost " + money + " UAH per 100 km");
    }
}
