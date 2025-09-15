package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[]{
                new Item("Comté", 10, 15),
                new Item("Comté", -4, 15),
                new Item("Comté", 1, 50),

                //Pass
                new Item("Pass VIP Concert", 25, 12),
                new Item("Pass VIP Concert", 8, 12),
                new Item("Pass VIP Concert", 3, 12),
                new Item("Pass VIP Concert", -1, 12),

                //Kryptonite
                new Item("Kryptonite", 10, 54),
                new Item("Kryptonite", 0, 80),
                new Item("Kryptonite", -2, 80),

                //Normal
                new Item("Normal", 20, 10),
                new Item("Normal", 0, 10),
                new Item("Normal", -4, 10),

                //Pouvoirs magique
                new Item("Pouvoirs Magiques", 20, 10),
                new Item("Pouvoirs Magiques", 0, 10),
                new Item("Pouvoirs Magiques", -4, 10),

                //Chocolat (application du TDD -3 quality)
                new Item("Chocolat", 15, 30),

        };

        Magasin app = new Magasin(items);
        app.updateQuality();
        //Test Comté
//        assertEquals(16, app.items[0].quality);
//        assertEquals(9, app.items[0].sellIn);
//        assertEquals(17, app.items[1].quality);
//        assertEquals(-5, app.items[1].sellIn);
//        assertEquals(50, app.items[2].quality);
//        assertEquals(0, app.items[2].sellIn);
//
//        //Test Pass
//        assertEquals(13, app.items[3].quality);
//        assertEquals(24, app.items[3].sellIn);
//        assertEquals(14, app.items[4].quality);
//        assertEquals(7, app.items[4].sellIn);
//        assertEquals(15, app.items[5].quality);
//        assertEquals(2, app.items[5].sellIn);
//        assertEquals(0, app.items[6].quality);
//        assertEquals(-2, app.items[6].sellIn);
//
//        //Test Kryptonite
//        assertEquals(54, app.items[7].quality);
//        assertEquals(10, app.items[7].sellIn);
//        assertEquals(80, app.items[8].quality);
//        assertEquals(0, app.items[8].sellIn);
//        assertEquals(80, app.items[9].quality);
//        assertEquals(-2, app.items[9].sellIn);
//
//        //Test normal
//        assertEquals(9, app.items[10].quality);
//        assertEquals(19, app.items[10].sellIn);
//        assertEquals(8, app.items[11].quality);
//        assertEquals(-1, app.items[11].sellIn);
//        assertEquals(8, app.items[12].quality);
//        assertEquals(-5, app.items[12].sellIn);

        //Test pouvoir magique
//        assertEquals(8, app.items[13].quality);
//        assertEquals(19, app.items[13].sellIn);
//        assertEquals(6, app.items[14].quality);
//        assertEquals(-1, app.items[14].sellIn);
//        assertEquals(6, app.items[15].quality);
//        assertEquals(-5, app.items[15].sellIn);
        assertEquals(27, app.items[16].quality);
        assertEquals(14, app.items[16].sellIn);


    }

}
