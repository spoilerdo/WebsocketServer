package com.kiddywebsocket.domain;

import java.util.Date;

public class Offer {
    private int offerId;
    private int itemId;
    private int senderId;
    private int senderBankNumber;
    private String offerName;
    private Float price;
    private boolean sold = false;
    private boolean news = true;
    private Date offerCreated = new Date();
    private Quality quality;

    public Offer(){
        //Constructor for Jackson
    }

    public Offer(int offerId, int itemId, int senderId, int senderBankNumber, String offerName, Float price, boolean sold, boolean news, Date offerCreated, Quality quality) {
        this.offerId = offerId;
        this.itemId = itemId;
        this.senderId = senderId;
        this.senderBankNumber = senderBankNumber;
        this.offerName = offerName;
        this.price = price;
        this.sold = sold;
        this.news = news;
        this.offerCreated = offerCreated;
        this.quality = quality;
    }

    public int getOfferId() {
        return offerId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getSenderId() {
        return senderId;
    }

    public int getSenderBankNumber() {
        return senderBankNumber;
    }

    public String getOfferName() {
        return offerName;
    }

    public Float getPrice() {
        return price;
    }

    public boolean isSold() {
        return sold;
    }

    public boolean isNews() {
        return news;
    }

    public Date getOfferCreated() {
        return offerCreated;
    }

    public Quality getQuality() {
        return quality;
    }
}
