package cases.pizza;

public class GreenOlivesTopping extends PizzaDecorator {

	private final Pizza pizza;
	
	public GreenOlivesTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Green Olives (3.76)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 3.76;
	}

}
