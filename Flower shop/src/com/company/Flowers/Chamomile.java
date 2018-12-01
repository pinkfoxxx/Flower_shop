package com.company.Flowers;

import com.company.Model.Flower;

public class Chamomile extends Flower {

    public Chamomile() {
        super.setColor("Yellow");
        super.setLenght("15");
        super.setOdor("Sharp");
        super.setCountry("Ukraine");
        super.setPrice(20);
    }

    public Chamomile(String color, String lenght, String odor, String country, double price) {
        super(color, lenght, odor, country, price);
    }

    @Override
    public String toString() {
        return "Chamomile{" + super.toString() + "}";
    }

    @Override
    public void attribute(){
        System.out.println("Chamomile - the presence of spikes");
    }

}
