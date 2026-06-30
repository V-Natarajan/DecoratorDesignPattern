package com.test;

import com.test.base.BaseCoffee;
import com.test.base.decorator.CoffeeDecorator;
import com.test.base.decorator.impl.ColdCoffee;
import com.test.base.decorator.impl.TandooriCoffee;
import com.test.base.impl.BaseCoffeeImpl;

public class CoffeeMenu {

	public static void main(String[] args) {
		BaseCoffee baseCoffee = new BaseCoffeeImpl();
		CoffeeDecorator coldCoffee = new ColdCoffee(baseCoffee);
		System.out.println("Cold Coffee");
		System.out.println(coldCoffee.baseCoffee());
		System.out.println("add on "+coldCoffee.add_on(" More ice cube "));
		System.out.println("Price "+coldCoffee.price());
		System.out.println("------------------");
		CoffeeDecorator tandooriCoffee = new TandooriCoffee(baseCoffee);
		System.out.println("Tandoori Coffee");
		System.out.println(tandooriCoffee.baseCoffee());
		System.out.println("add_on "+tandooriCoffee.add_on(" More Sugar "));
		System.out.println("Price  "+tandooriCoffee.price());
		
	}

}
