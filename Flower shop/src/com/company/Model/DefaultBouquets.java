package com.company.Model;

import com.company.Flowers.Chamomile;
import com.company.Flowers.Rosie;
import com.company.Flowers.Tulip;

public enum DefaultBouquets {

  BOUQUET1("KissOfDeath",new Bouquet(new Flower[]{new Rosie(),new Chamomile(), new Tulip()},new int[]{1,1,2})),
  BOUQUET2("FirstDate",new Bouquet(new Flower[]{new Rosie(),new Chamomile(), new Tulip()},new int[]{2,4,2})),
  BOUQUET3("Aroma",new Bouquet(new Flower[]{new Rosie(),new Chamomile(), new Tulip()},new int[]{3,1,2})),
  BOUQUET4("FreeListener",new Bouquet(new Flower[]{new Rosie(),new Chamomile(), new Tulip()},new int[]{1,1,1})),
  BOUQUET5("YouAreEverything",new Bouquet(new Flower[]{new Rosie(),new Chamomile(), new Tulip()},new int[]{5,1,3}));

    private final String name;
    private final Bouquet bouquet ;


  DefaultBouquets(String name, Bouquet bouquet) {
        this.name = name;
        this.bouquet = bouquet;
  }

    @Override
    public String toString() {
        return "DefaultBouquets{" +
                "name='" + name + '\'' +
                ", bouquet=" + bouquet +
                '}';
    }
}
