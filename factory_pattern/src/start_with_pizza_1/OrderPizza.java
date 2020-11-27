package start_with_pizza_1;

public class OrderPizza {
	/**
	 * multiple pizza type
	 * 
	 * add multiple pizza type --> causing trouble for method orderPizza
	 */
	Pizza orderPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new GreekPizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		}
		
		pizza.box();
		pizza.bake();
		pizza.cut();
		return pizza;
	}
}
