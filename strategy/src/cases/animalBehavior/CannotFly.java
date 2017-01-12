package cases.animalBehavior;

public class CannotFly implements Flyable {

	@Override
	public void fly() {
		System.out.println("I'm not able to fly !!!");
	}

}
