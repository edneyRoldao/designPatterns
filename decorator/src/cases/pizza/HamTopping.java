package cases.pizza;

public class HamTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public HamTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Ham (11.55)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 11.55;
	}

}
