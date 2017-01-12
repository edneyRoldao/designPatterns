package cases.pizza;

public class TomatoesTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public TomatoesTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Tomatoes (3.97)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 3.97;
	}

}
