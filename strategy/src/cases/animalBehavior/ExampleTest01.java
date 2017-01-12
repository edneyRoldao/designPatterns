package cases.animalBehavior;

public class ExampleTest01 {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.tryToFly();
		
		Cat cat = new Cat();
		cat.tryToFly();
		
		Bird bird = new Bird();
		bird.tryToFly();
		
		Hawk hawk = new Hawk();
		hawk.setFlyableAbility(new FlyWithWings());
		hawk.tryToFly();
		
		
	}

}
