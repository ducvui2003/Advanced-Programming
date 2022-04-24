package exercisesLoop;

public class Ex7 {
	public static void main(String[] args) {
		System.out.println("Banh cuu chuong");
		for (int i = 2; i <= 9; i++) {
			System.out.print("\t" + i);
		}
		System.out.println("\n------------------------");
		for (int j = 1; j <= 10; j++) {
			System.out.print(j + " / ");
			for (int i = 2; i <= 9; i++) {
				System.out.printf("\t%d", i * j);
			}
			System.out.println("");
		}
	}
}
