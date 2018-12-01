package com.company.Flowers;

import com.company.Model.Flower;

public class Tulip extends Flower {

    public Tulip() {
        super.setColor("Pink");
        super.setLenght("25");
        super.setOdor("Gentle");
        super.setCountry("Netherlands");
        super.setPrice(100);
    }

    public Tulip(String color, String lenght, String odor, String country, double price) {
        super(color, lenght, odor, country, price);
    }

    @Override
    public String toString() {
        return "Tulip{" + super.toString() + "}";
    }

    @Override
    public void attribute(){
        System.out.println("Tulip - the presence of spikes");
    }
}
