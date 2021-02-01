package com.people;

class Boy extends Male {
    private final double weight;
    private final double height;

    public Boy(double weight, double height) {
        super(weight, height);
        this.weight = weight;
        this.height = height;
    }


    @Override
    double weightCount() {
        return (height - 100) - (height - 150) / 4;
    }

    @Override
    void idealWeight() {
        if (weight > weightCount()) {
            System.out.println("get down  " + (weight - weightCount()));
        } else if (weightCount() > weight) {
            System.out.println("get up " + (weightCount() - weight));
        } else {
            System.out.println("you have a perfect weight");
        }
    }
}
