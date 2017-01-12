package cases.pizza;

public abstract class PizzaDecorator implements Pizza{
	
	@Override
	public String getDescription() {
		return "Toppings";
	}

}
