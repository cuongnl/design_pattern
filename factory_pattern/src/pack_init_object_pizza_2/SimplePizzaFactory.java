package pack_init_object_pizza_2;

import start_with_pizza_1.CheesePizza;
import start_with_pizza_1.GreekPizza;
import start_with_pizza_1.PepperoniPizza;
import start_with_pizza_1.Pizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new GreekPizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
