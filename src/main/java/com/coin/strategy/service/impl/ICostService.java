package com.coin.strategy.service.impl;

public interface ICostService {
	double getSellPrice(double buyPrice);

	double getBuyPrice(double sellPrice);
}
