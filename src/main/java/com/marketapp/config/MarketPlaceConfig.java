package com.marketapp.config;

import com.marketapp.model.Market;
import com.marketapp.model.MarketPlace;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketPlaceConfig {
    public static final List<String> marketIds = Arrays.asList("btcusdt", "ethusdt", "bnbusdt");

    public void configMarketPlace() {
        MarketPlace marketPlace = MarketPlace.getInstance();
        Map<String, Market> markets = createMarkets();
        marketPlace.setMarkets(markets);
    }


    private Map<String, Market> createMarkets() {
        Map<String, Market> markets = new HashMap<>();
        for (String marketId : marketIds) {
            Market market = new Market();
            market.setId(marketId);
            markets.put(marketId, market);
        }
        return markets;
    }
}
