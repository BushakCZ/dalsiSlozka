package com.company;

public class Human {

    private String name;
    private int age;
    private int numberOfLegs;
    private String skin;
    private int idNumber;

    public Human(String name, int age, int numberOfLegs, String skin, int idNumber) {
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.skin = skin;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", skin='" + skin + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public void walk() {
        if(numberOfLegs == 2 || numberOfLegs == 3){
            System.out.println(name + " is walking");
        }else{
            System.out.println(name + " is wheelchair drifting");
        }
    }

    public void talk() {
        System.out.println(name + " is talking");
    }

    public void greetings() {
        System.out.println("Dobry den");
    }

    public void cook(){
        System.out.println("Neumim varit");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////
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

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
