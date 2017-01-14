package cases.pizza;

public class CheeseTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public CheeseTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese (4.55)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 4.55;
	}

}
