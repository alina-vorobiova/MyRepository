package com.marketapp.model;

import java.util.Map;

public class MarketPlace {
    private Map<String, Market> markets;

    private MarketPlace() {

    }

    private static class MarketPlaceHelper {
        private static final MarketPlace instance = new MarketPlace();
    }

    public static MarketPlace getInstance() {
        return MarketPlaceHelper.instance;
    }

    public Map<String, Market> getMarkets() {
        return markets;
    }

    public void setMarkets(Map<String, Market> markets) {
        this.markets = markets;
    }
}
