package com.company.Flowers;

import com.company.Model.Flower;

public class Rosie extends Flower {

    public Rosie() {
        super.setColor("Red");
        super.setLenght("30");
        super.setOdor("Dangerous");
        super.setCountry("Bulgaria");
        super.setPrice(120);
    }

    public Rosie(String color, String lenght, String odor, String country, double price) {
        super(color, lenght, odor, country, price);
    }

    @Override
    public String toString() {
        return "Rosie{" + super.toString() + "}";
    }

    @Override
    public void attribute(){
        System.out.println("Rose - the presence of spikes");
    }
}
