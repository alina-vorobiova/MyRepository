package com.marketapp.service;


import java.util.List;

public interface MarketUpdateService {

    void updatePrices(String response);

    void updateLevels(String marketId, List<String> levels);

    void updateOrderStatus(String marketId, String orderId, String status);

}
