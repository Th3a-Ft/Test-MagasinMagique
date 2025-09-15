package com.magasin;

import java.util.ArrayList;

public class GoldenMaster {
    public static void main(String[] args) {
        Item[] items = new Item[]{
                //GM Comté
                new Item("Comté", 10, 15),
                new Item("Comté", -4, 15),
                new Item("Comté", 1, 50),

                //GM Pass
                new Item("Pass VIP Concert", 25, 12),
                new Item("Pass VIP Concert", 8, 12),
                new Item("Pass VIP Concert", 3, 12),
                new Item("Pass VIP Concert", -1, 12),

                //GM Kryptonite
                new Item("Kryptonite", 10, 54),
                new Item("Kryptonite", 0, 80),
                new Item("Kryptonite", -2, 80),

                //GM Normal
                new Item("Normal", 20, 10),
                new Item("Normal",0,10),
                new Item("Normal",-4,10),
        };
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();
        displayQuality(items);
    }


    public static void displayQuality(Item[] items) {
        for (int i = 0; i < 3; i++) {
            System.out.println("---Jour " + i +" ---");

            for (Item item : items) {
                System.out.println(item.name + ": quality: " + item.quality + " / sellIn: " + item.sellIn);
            }
        }
    }


}
