package exercisesLoop;

public class Ex3 {
	public static void main(String[] args) {
		int ageSon = 4, ageFather = 35, year = 0;
		do {
			year =year+1;
			ageSon =ageSon+1;
			ageFather = ageFather+1;

		} while (ageFather != ageSon * 2);
		System.out.println(year);
	}
}
