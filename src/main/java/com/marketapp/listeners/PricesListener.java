package com.marketapp.listeners;

import com.binance.connector.futures.client.WebsocketClient;
import com.binance.connector.futures.client.impl.UMWebsocketClientImpl;
import com.marketapp.config.MarketPlaceConfig;
import com.marketapp.service.MarketUpdateService;

public class PricesListener implements EventListener {
    protected MarketUpdateService marketUpdateService;

    public PricesListener(MarketUpdateService marketUpdateService) {
        this.marketUpdateService = marketUpdateService;
    }

    @Override
    public void startListening() {

        WebsocketClient client = new UMWebsocketClientImpl();
        for (String marketId : MarketPlaceConfig.marketIds) {
            client.aggTradeStream(marketId.toLowerCase(), marketUpdateService::updatePrices);
        }
    }
}


