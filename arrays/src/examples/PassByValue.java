package examples;

public class PassByValue {
	public static void main(String[] args) {
		int x = 1;
		int[] y = new int[10];
		methodE(x, y);
		System.out.println("x is " + x);
		System.out.println("y[0] is " + y[0]);
	}

	public static void methodE(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 5555;
	}
}
