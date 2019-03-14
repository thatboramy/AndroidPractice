package com.example.practiceapp;

public class Shirt {
    public String name;
    public String color;


    public Shirt(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static final Shirt[] shirts = {
            new Shirt("TankTop", "Red"),
            new Shirt("Sweater", "Blue"),
            new Shirt("Hoodie", "Blue"),
            new Shirt("Hoodie", "Black"),
            new Shirt("Shirt", "Pink"),
            new Shirt("Hoodie", "Blue"),
            new Shirt("Button-Up", "Red"),
            new Shirt("Shirt", "White"),
            new Shirt("Jacket", "Green"),
            new Shirt("T-Shirt", "Yellow"),
            new Shirt("Blouse", "White")
    };
}
