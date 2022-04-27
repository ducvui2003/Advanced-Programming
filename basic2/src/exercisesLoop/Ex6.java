package exercisesLoop;

public class Ex6 {
	public static void main(String[] args) {
		double sin = 0, cos = 0, tang = 0, cotang = 0;
		for (int i = 0; i <= 90; i += 5) {
			sin = Math.sin(i);
			cos = Math.cos(i);
			tang = Math.tan(i);
			cotang = 1 / tang;
			System.out.printf("Conner: %d \n\tSin: %f \n\tCos: %f \n\tTan: %f \n\tCotang: %f \n", i, sin, cos, tang,
					cotang);
		}
	}
}
