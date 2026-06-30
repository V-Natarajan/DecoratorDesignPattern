package com.test.base.impl;

import com.test.base.BaseCoffee;

public class BaseCoffeeImpl implements BaseCoffee {

	@Override
	public String baseCoffee() {
		return "Base Coffee ";
	}

	@Override
	public Double price() {
		return 100d;
		
	}

}
