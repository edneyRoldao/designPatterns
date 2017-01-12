package cases.animalBehavior;

public abstract class Animal {

	private String name;
	private float weight;
	protected Flyable flyable;

	
	public void tryToFly() {
		flyable.fly();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setFlyableAbility(Flyable flyable) {
		this.flyable = flyable;
	}

}
