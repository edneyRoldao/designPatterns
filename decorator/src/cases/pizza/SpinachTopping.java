package cases.pizza;

public class SpinachTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public SpinachTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Spinach (4.55)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 4.55;
	}

}
