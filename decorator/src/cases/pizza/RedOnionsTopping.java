package cases.pizza;

public class RedOnionsTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public RedOnionsTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Red Onions (2.33)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 2.33;
	}

}
