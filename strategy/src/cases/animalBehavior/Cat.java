package cases.animalBehavior;

public class Cat extends Animal {

	public Cat() {
		super();
		flyable = new CannotFly();
	}
	
}
