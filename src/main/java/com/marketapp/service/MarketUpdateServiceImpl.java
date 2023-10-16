package com.marketapp.service;

import com.marketapp.converter.AggTradeEventConverter;
import com.marketapp.model.Market;
import com.marketapp.model.MarketPlace;
import com.marketapp.model.event.AggTradeEvent;

import java.util.List;

public class MarketUpdateServiceImpl implements MarketUpdateService {

    private final AggTradeEventConverter aggTradeEventConverter;

    public MarketUpdateServiceImpl(AggTradeEventConverter aggTradeEventConverter) {
        this.aggTradeEventConverter = aggTradeEventConverter;
    }

    @Override
    public void updatePrices(String response) {
        AggTradeEvent aggTradeEvent = aggTradeEventConverter.convert(response);
        if (aggTradeEvent == null) {
            return;
        }
        Long eventTime = aggTradeEvent.getEventTime();
        Long nowTime = System.currentTimeMillis();
        System.out.println("Price receiving delta=" + (nowTime - eventTime) + "ms");
        String marketId = aggTradeEvent.getSymbol();
        String price = aggTradeEvent.getPrice();
        //String quantity = aggTradeEvent.getQuantity();
        Market market = MarketPlace.getInstance().getMarkets().get(marketId.toLowerCase());
        market.setPrice(price);
        System.out.println("Symbol: " + aggTradeEvent.getSymbol());
        System.out.println("Price: " + aggTradeEvent.getPrice());
        System.out.println("Quantity: " + aggTradeEvent.getQuantity());

        //logic

        //send create request
    }

    @Override
    public void updateLevels(String marketId, List<String> levels) {

    }

    @Override
    public void updateOrderStatus(String marketId, String orderId, String status) {

    }
}
