package com.kiddywebsocket.domain;

/**
 * POJO object for wonitemmessage websocket response
 */
public class Item {
    private int itemID;
    private String name;
    private Float price;
    private Rarity rarity;

    public Item(){
        //Constructor for jackson
    }

    public Item(int itemID, String name, Float price, Rarity rarity){
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.rarity = rarity;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }
}
