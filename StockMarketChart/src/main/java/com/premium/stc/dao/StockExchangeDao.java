package com.premium.stc.dao;

import java.util.List;

import com.premium.stc.model.StockExchange;


public interface StockExchangeDao {
	public StockExchange insertStock(StockExchange stockEx);
	public List<StockExchange> GetAllStock();
}
