package start_with_pizza_1;

public class CheesePizza implements Pizza {

	@Override
	public String description() {
		return "Cheese pizza";
	}

	@Override
	public String prepare() {
		return "prepare";
	}

	@Override
	public String bake() {
		return "bake";
	}

	@Override
	public String cut() {
		return "cut";
	}

	@Override
	public String box() {
		return "box";
	}

}
