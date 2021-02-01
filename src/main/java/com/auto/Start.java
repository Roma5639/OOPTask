package com.auto;

public class Start {
    public static void main(String[] args) {
        System.out.println("car:");
        Car mers = new Car(2.2);
        mers.moneyConsumption();

        System.out.println("truck:");
        Truck volvo = new Truck(3.5);
        volvo.moneyConsumption();

        System.out.println("electrocar:");
        ElectroCar tesla = new ElectroCar(10);
        tesla.moneyConsumption();
    }
}
