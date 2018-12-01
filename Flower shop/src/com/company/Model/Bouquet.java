package com.company.Model;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList();
    private double price;

    public Bouquet() {
        this.price = 0;
    }

    public Bouquet(Flower[] flower, int[] k) {
        addFlowers(flower[0], k[0]);
        addFlowers(flower[1], k[1]);
        addFlowers(flower[2], k[2]);
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", price=" + price +
                '}';
    }

    public void addFlowers(Flower flower, int k){
        for (int i =0; i<k; i++) {
            flowers.add(flower);
            this.price =price + flower.getPrice();
        }
    }

}
