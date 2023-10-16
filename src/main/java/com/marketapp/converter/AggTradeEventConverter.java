package com.marketapp.converter;

import com.marketapp.model.event.AggTradeEvent;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AggTradeEventConverter {

    public AggTradeEvent convert(String response) {
        ObjectMapper objectMapper = new ObjectMapper();
        AggTradeEvent aggTradeEvent = null;
        try {
            aggTradeEvent = objectMapper.readValue(response, AggTradeEvent.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aggTradeEvent;
    }
}
