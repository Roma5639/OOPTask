package com.people;

class Girl extends Female {
    private final double weight;
    private final double height;

    public Girl(double weight, double height) {
        super(weight, height);
        this.weight = weight;
        this.height = height;
    }

    @Override
    double weightCount() {
        return (height - 100) - (height - 150) / 2;
    }

    @Override
    void idealWeight() {
        if (weight > weightCount()) {
            System.out.println("get down  " + (weight - weightCount())+ " kg");
        } else if (weightCount() > weight) {
            System.out.println("get up " + (weightCount() - weight)+ " kg");
        } else {
            System.out.println("you have a perfect weight");
        }
    }
}
