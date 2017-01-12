package cases.pizza;

public class NormalPizza implements Pizza{

	@Override
	public String getDescription() {
		return "It is a normal Pizza (150)";
	}

	@Override
	public double getPrice() {
		return 150.0;
	}

}
