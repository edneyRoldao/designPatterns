package cases.pizza;

public class VegetablePizza implements Pizza{

	@Override
	public String getDescription() {
		return "Simple vegPizza (230)";
	}

	@Override
	public double getPrice() {
		return 230.0;
	}

}
