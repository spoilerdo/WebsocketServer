package com.kiddywebsocket.controllers;

import com.kiddywebsocket.domain.Item;
import com.kiddywebsocket.domain.WonItemMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class WonItemController {

    @MessageMapping("/{caseID}/items")
    @SendTo("/topic/{caseID}/items")
    public WonItemMessage newMessage(@DestinationVariable int caseID, Item item) {
        return new WonItemMessage(UUID.randomUUID(), caseID, item);
    }

}
