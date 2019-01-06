package com.kiddywebsocket.controllers;

import com.kiddywebsocket.domain.Offer;
import com.kiddywebsocket.domain.SoldOfferMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class SoldOfferController {

    @MessageMapping("/{offerId}/offers")
    @SendTo("/topic/{offerId}/offers")
    public SoldOfferMessage newMessage(@DestinationVariable int offerId, Offer offer){
        return new SoldOfferMessage(UUID.randomUUID(), offerId, offer);
    }
}
