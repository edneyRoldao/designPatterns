package cases.pizza;

import java.text.DecimalFormat;

public class PizzaCalculatorTest {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Creating pizza(concrete component)
		Pizza vp = new VegetablePizza();
		
		// Adding toppings(decorators)
		vp = new TomatoesTopping(vp);
		vp = new BroccoliTopping(vp);
		vp = new SpinachTopping(vp);
		vp = new GreenOlivesTopping(vp);
		
		System.out.println("Vegetable pizza:".toUpperCase());
		System.out.println("-------------------");
		System.out.println("Description: " + vp.getDescription());
		System.out.println("Price: " + df.format(vp.getPrice()));
		
		System.out.println();
		System.out.println();

		System.out.println("Traditional pizza:".toUpperCase());
		System.out.println("-------------------");
		System.out.println("Description: " + vp.getDescription());
		System.out.println("Price: " + df.format(vp.getPrice()));
	}
	
}
