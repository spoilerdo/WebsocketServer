package com.kiddywebsocket.domain;

import java.util.UUID;

public class SoldOfferMessage {
    private UUID msgID;
    private int accountId;
    private Offer offer;

    public SoldOfferMessage(){

    }

    public SoldOfferMessage(UUID msgID, int accountId, Offer offer) {
        this.msgID = msgID;
        this.accountId = accountId;
        this.offer = offer;
    }

    public UUID getMsgID() {
        return msgID;
    }

    public Offer getOffer() {
        return offer;
    }

    public int getAccountId() {
        return accountId;
    }
}
