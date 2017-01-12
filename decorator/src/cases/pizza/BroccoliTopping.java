package cases.pizza;

public class BroccoliTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public BroccoliTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Broccoli (7.55)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 7.55;
	}

}
