package com.marketapp;

import com.marketapp.config.MarketPlaceConfig;
import com.marketapp.converter.AggTradeEventConverter;
import com.marketapp.listeners.EventListener;
import com.marketapp.listeners.PricesListener;
import com.marketapp.service.MarketUpdateService;
import com.marketapp.service.MarketUpdateServiceImpl;

public class MarketApplication {

	public static void main(String[] args) {
		MarketPlaceConfig marketPlaceConfig = new MarketPlaceConfig();
		marketPlaceConfig.configMarketPlace();

		AggTradeEventConverter aggTradeEventConverter = new AggTradeEventConverter();
		MarketUpdateService marketUpdateService = new MarketUpdateServiceImpl(aggTradeEventConverter);

		EventListener pricesListener = new PricesListener(marketUpdateService);
		pricesListener.startListening();
	}
}
