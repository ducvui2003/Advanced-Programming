package objectAndClass;

public class Random {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.println(random.nextInt(100));
		}
	}
}
