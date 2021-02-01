package com.people;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Father:");
        Male father = new Male(72, 177 );
        father.idealWeight();
        System.out.println("you goal is " + father.weightCount()+ " kg");

        System.out.println("Mother:");
        Female mother = new Female(65, 154 );
        mother.idealWeight();
        System.out.println("you goal is " + mother.weightCount() + " kg");

        System.out.println("Son ");
        Boy son = new Boy(56, 162 );
        son.idealWeight();
        System.out.println("you goal is: " + son.weightCount() + " kg");

        System.out.println("Daughter");
        Girl daughter = new Girl(30, 130 );
        daughter.idealWeight();
        System.out.println("you goal is: " + daughter.weightCount() + " kg");


    }
}
