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
            if (item.quality < 50) {
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
                } else if (item.name.equals("Pouvoirs Magiques")){
                    if (item.sellIn > 0) {
                        item.quality -= 2;
                    } else {
                        item.quality -= 4;
                    }
                }
                else {
                    if (item.sellIn > 0) {
                        item.quality -= 1;
                    } else {
                        item.quality -= 2;
                    }
                }
            } else {
                item.quality = 50;
            }
        }
    }
}


//            //si item normal ou krypto
//            if (!item.name.equals("Comté") && !item.name.equals("Pass VIP Concert")) {
//                //si quality sup à 0
//                if (item.quality > 0) {
//                    //si diff de kryptonite (donc normal)
//                    if (!item.name.equals("Kryptonite")) {
//                        //quality -1
//                        item.quality = item.quality - 1;
//                    }
//                }
//                //si produit est pas normal (pass ou comté)
//            } else {
//                //si quality inf à 50
//                if (item.quality < 50) {
//                    //quality +1
//                    item.quality = item.quality + 1;
//
//                    //si pass
//                    if (item.name.equals("Pass VIP Concert")) {
//                        //si item sellIn inf à 11
//                        if (item.sellIn < 11) {
//                            //si quality inf à 50
//                            if (item.quality < 50) {
//                                //faire quality +1
//                                item.quality = item.quality + 1;
//                            }
//                        }
//                        //si item sellIn inf à 6
//                        if (item.sellIn < 6) {
//                            //si quality inf à 50
//                            if (item.quality < 50) {
//                                //faire quality +1
//                                item.quality = item.quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//            //si item kryptonite
//            if (!item.name.equals("Kryptonite")) {
//                //sellIn = -1
//                item.sellIn = item.sellIn - 1;
//            }
//
//            //si sellIN inf à 0
//            if (item.sellIn < 0) {
//                //si item diff de comté (donc normal, krypto, pass)
//                if (!item.name.equals("Comté")) {
//                    //si item diff de pass et de comté (donc normal et krypto)
//                    if (!item.name.equals("Pass VIP Concert")) {
//                        //si quality inf à 0
//                        if (item.quality > 0) {
//                            //si item diff de krypto (donc normal)
//                            if (!item.name.equals("Kryptonite")) {
//                                //quality = -1
//                                item.quality = item.quality - 1;
//                            }
//                        }
//                    } else {
//                        //sinon (diff de comté et pass VIP) quality = 0
//                        item.quality = 0;
//                    }
//                } else {
//                    //sinon quality = +1
//                    if (item.quality < 50) {
//                        item.quality = item.quality + 1;
//                    }
//                }
//            }
//    }
//}
//}
