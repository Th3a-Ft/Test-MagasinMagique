package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];

            //sellIN
            if (item.name.equals("Kryptonite")) {
                continue;
            } else {
                item.sellIn -= 1;
            }

            //quality
            if (item.quality < 50 && item.quality >0) {
                if (item.name.equals("Comté")) {
                    if (item.sellIn > 0) {
                        item.quality += 1;
                    } else {
                        item.quality += 2;
                    }
                } else if (item.name.equals("Pass VIP Concert")) {
                    if (item.sellIn > 10) {
                        item.quality += 1;
                    } else if (item.sellIn > 5) {
                        item.quality += 2;
                    } else if (item.sellIn > 0) {
                        item.quality += 3;
                    } else {
                        item.quality = 0;
                    }
                } else if (item.name.equals("Pouvoirs Magiques")) {
                    if (item.sellIn > 0) {
                        item.quality -= 2;
                    } else {
                        item.quality -= 4;
                    }
                } else if (item.name.equals("Chocolat")) {
                    if (item.sellIn > 0) {
                        item.quality -= 3;
                    }
                } else {
                    if (item.sellIn > 0) {
                        item.quality -= 1;
                    } else {
                        item.quality -= 2;
                    }
                }
            } else if (item.quality > 50) {
                item.quality = 50;
            } else if (item.quality < 0) {
                item.quality = 0;
            }
        }
    }
}

