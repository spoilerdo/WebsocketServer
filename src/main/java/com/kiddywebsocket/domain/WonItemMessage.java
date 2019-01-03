package com.kiddywebsocket.domain;

import java.util.UUID;

public class WonItemMessage {
    private UUID msgID;
    private int caseID;
    private Item item;

    public WonItemMessage() {

    }

    public WonItemMessage(UUID msgID, int caseID, Item item) {
        this.msgID = msgID;
        this.caseID = caseID;
        this.item = item;
    }

    public UUID getMsgID() {
        return msgID;
    }

    public int getCaseID() {
        return caseID;
    }

    public Item getItem() {
        return item;
    }
}
