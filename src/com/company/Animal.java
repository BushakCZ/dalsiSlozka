package com.company;

public class Animal {

    private String name;
    private int age;
    private int numberOfLegs;
    private String type;

    public Animal(String name, int age, int numberOfLegs, String type) {
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", type='" + type + '\'' +
                '}';
    }

    public void sound(){
        System.out.println("Vrrr");
    }
    public void walk(){
        if (numberOfLegs == 4){
            System.out.println(name + " is walking");
        }else{
            System.out.println(name + " is crippled");
        }
    }
/////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
