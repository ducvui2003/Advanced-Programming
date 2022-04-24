package whileLoop;

public class Addition {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i < 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum is "+ sum);
	}
}
