package start_with_pizza_1;

public class GreekPizza implements Pizza {

	@Override
	public String description() {
		return "Greek pizza";
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
