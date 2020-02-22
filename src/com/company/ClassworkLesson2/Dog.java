package com.company.ClassworkLesson2;

public class Dog {
    private String color;
    private String breed;

    private int weight;
    private int strength;

    private Dog() {
    }

    public Dog(String color, String breed, String weight, String strength) {
        this.color = color;
        this.breed = breed;
        this.weight = weight;
        this.strength = strength;
    }

    public String getColor() {
        return this.color;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String fight(Dog dog){
        if(this.strength > dog.strength){
            return this.breed;
        }
    }
}
