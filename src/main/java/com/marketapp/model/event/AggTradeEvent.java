package com.marketapp.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AggTradeEvent {
    @JsonProperty("e")
    private String eventType;
    @JsonProperty("E")
    private Long eventTime;
    @JsonProperty("s")
    private String symbol;
    @JsonProperty("a")
    private Long aggregateTradeID;
    @JsonProperty("p")
    private String price;
    @JsonProperty("q")
    private String quantity;
    @JsonProperty("f")
    private Long firstTradeID;
    @JsonProperty("l")
    private Long lastTradeID;
    @JsonProperty("T")
    private Long tradeTime;
    @JsonProperty("m")
    private Boolean isBuyerMarketMaker;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Long getAggregateTradeID() {
        return aggregateTradeID;
    }

    public void setAggregateTradeID(Long aggregateTradeID) {
        this.aggregateTradeID = aggregateTradeID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Long getFirstTradeID() {
        return firstTradeID;
    }

    public void setFirstTradeID(Long firstTradeID) {
        this.firstTradeID = firstTradeID;
    }

    public Long getLastTradeID() {
        return lastTradeID;
    }

    public void setLastTradeID(Long lastTradeID) {
        this.lastTradeID = lastTradeID;
    }

    public long getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(long tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Boolean getIsBuyerMarketMaker() {
        return isBuyerMarketMaker;
    }

    public void setIsBuyerMarketMaker(Boolean isBuyerMarketMaker) {
        this.isBuyerMarketMaker = isBuyerMarketMaker;
    }
}