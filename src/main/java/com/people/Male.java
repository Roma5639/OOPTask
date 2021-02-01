package com.people;

class Male extends Human {
    private final double weight;
    private final double height;

    public Male(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    double weightCount() {
        return (height - 100) - (height - 150)/4;

    }

    void idealWeight() {

        if (weight > weightCount()) {
            System.out.println("get down  " + (weight - weightCount())+ " kg");
        } else if (weightCount() > weight ) {
            System.out.println("get up " + (weightCount() - weight)+ " kg");
        } else {
            System.out.println("you have a perfect weight");
        }
    }
}
