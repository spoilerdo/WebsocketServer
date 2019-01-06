package com.kiddywebsocket.domain;

import java.util.UUID;

public class SoldOfferMessage {
    private UUID msgID;
    private int offerId;
    private Offer offer;

    public SoldOfferMessage(){

    }

    public SoldOfferMessage(UUID msgID, int offerId, Offer offer) {
        this.msgID = msgID;
        this.offerId = offerId;
        this.offer = offer;
    }

    public UUID getMsgID() {
        return msgID;
    }

    public Offer getOffer() {
        return offer;
    }

    public int getOfferId() {
        return offerId;
    }
}
