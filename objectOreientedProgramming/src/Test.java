
public class Test {
	public static void main(String[] args) {
		Animal animal = new Chicken();
		animal.howToEat();

		animal = new Duck();
		animal.howToEat();

		Edible stuff = new Chicken();
		stuff.howToEat();

		stuff = new Duck();
		stuff.howToEat();

		stuff = new Broccoli();
		stuff.howToEat();
	}

}
