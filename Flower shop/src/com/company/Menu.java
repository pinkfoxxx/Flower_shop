package com.company;

import com.company.Flowers.Chamomile;
import com.company.Flowers.Rosie;
import com.company.Flowers.Tulip;
import com.company.Model.Bouquet;
import com.company.Model.DefaultBouquets;

import java.util.Scanner;

import static com.company.Model.DefaultBouquets.*;

public class Menu {

    public static void menu(){
        DefaultBouquets[] defaultBouquets = {BOUQUET1, BOUQUET2, BOUQUET3, BOUQUET4, BOUQUET5};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what you want: "
                + "\n1 - Choose default bouquet"
                + "\n2 - Make your own");
        String s1;
        do {
            s1 = scanner.next();
        } while (!(s1.equals("1") || s1.equals("2")));
        switch (s1) {
            case "1":
                for (int i = 0; i < defaultBouquets.length; i++) {
                    System.out.println((i + 1) + " - " + defaultBouquets[i]);
                }
                break;
            case "2":
                Bouquet bouquet = new Bouquet();
                boolean isReady = false;
                while (!isReady) {
                    System.out.println("Choose type of flowers you want add to bouquet"
                            + "\n1 - Rosie"
                            + "\n2 - Chamomile"
                            + "\n3 - Tulip"
                            + "\n4 - Stop adding and make bouquet");
                    String s2;
                    do {
                        s2 = scanner.next();
                    } while (!(s2.equals("1") || s2.equals("2")
                            || s2.equals("3") || s2.equals("4")));

                    switch (s2) {
                        case "1":
                            bouquet.addFlowers(new Rosie(), flowersCount());
                            break;
                        case "2":
                            bouquet.addFlowers(new Chamomile(), flowersCount());
                            break;
                        case "3":
                            bouquet.addFlowers(new Tulip(), flowersCount());
                            break;
                        case "4":
                            isReady = true;
                            System.out.println(bouquet);
                            System.out.println("Bouquet Price = " + bouquet.getPrice());
                            break;
                    }
                }
        }
    }

    public static int flowersCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number of flowers you want to add to bouquet");
        int i = 0;
        do {
            try {
                i = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Write correct integer number");
            }
        } while (i == 0);
        return i;
    }
    }

