package cases.pizza;

public class ChikenTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public ChikenTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Chiken (12.84)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 12.84;
	}

}
