package com.test.base.decorator;

import com.test.base.BaseCoffee;

public abstract class CoffeeDecorator implements BaseCoffee {

	public CoffeeDecorator(BaseCoffee baseCoffee) {
	}
	public abstract String add_on(String add);
	
}
