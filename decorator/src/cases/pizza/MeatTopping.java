package cases.pizza;

public class MeatTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public MeatTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Meat (15.85)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 15.85;
	}

}
