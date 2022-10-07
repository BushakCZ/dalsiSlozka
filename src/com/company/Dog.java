package com.company;

public class Dog extends Animal{
    public Dog(String name, int age, int numberOfLegs, String type) {
        super(name, age, numberOfLegs, type);
    }
    public void sound(){
        System.out.println("Haf Haf");
    }
}
