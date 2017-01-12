package cases.animalBehavior;

public class Dog extends Animal {
	
	public Dog() {
		super();
		flyable = new CannotFly();
	}

}
