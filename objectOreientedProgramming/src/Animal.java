
public abstract class Animal {
	public abstract String howToEat();

}

class Chicken extends Animal implements Edible {
	@Override
	public String howToEat() {
		return "Fry it";
	}
}

class Duck extends Animal implements Edible {
	@Override
	public String howToEat() {
		return "Roast it";
	}

}
