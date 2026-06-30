package com.test.base.decorator.impl;

import com.test.base.BaseCoffee;
import com.test.base.decorator.CoffeeDecorator;

public class ColdCoffee extends CoffeeDecorator {

	private BaseCoffee baseCoffee;

	public ColdCoffee(BaseCoffee baseCoffee) {
		super(baseCoffee);
		this.baseCoffee = baseCoffee;
	}

	@Override
	public String baseCoffee() {
		return baseCoffee.baseCoffee()+" Cold Coffee";
	}

	@Override
	public Double price() {
		return baseCoffee.price()+15;
	}

	@Override
	public String add_on(String add) {
		
		return add;
	}

}
