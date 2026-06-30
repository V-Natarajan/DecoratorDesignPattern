package com.test.base.decorator.impl;

import com.test.base.BaseCoffee;
import com.test.base.decorator.CoffeeDecorator;

public class TandooriCoffee extends CoffeeDecorator {

	private BaseCoffee baseCoffee;

	public TandooriCoffee(BaseCoffee baseCoffee) {
		super(baseCoffee);
		this.baseCoffee = baseCoffee;
	}

	@Override
	public String baseCoffee() {
		return baseCoffee.baseCoffee()+ " Tandoori Coffee ";
	}

	@Override
	public Double price() {
		return baseCoffee.price()+250;
	}

	@Override
	public String add_on(String add) {
		return add;
	}

}
