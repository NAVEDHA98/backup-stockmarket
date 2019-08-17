package com.premium.stc.dao;

import java.util.List;

import com.premium.stc.model.StockPrice;

public interface StockPriceDao {
	public StockPrice insertStock(StockPrice stock);
    public StockPrice updateStock(StockPrice stock);
   public List<StockPrice> getStockPrice();
   
}
