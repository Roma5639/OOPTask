package com.people;

class Female extends Human {
    private final double weight;
    private final double height;

    public Female(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    double weightCount() {
        return (height - 100) - (height - 150)/2;
    }

    void idealWeight() {

        if (weight > weightCount()) {
            System.out.println("get down  " + (weight - weightCount()) + " kg");
        } else if (weightCount() > weight) {
            System.out.println("get up " + (weightCount() - weight) + " kg");
        } else {
            System.out.println("you have a perfect weight");
        }
    }
}
