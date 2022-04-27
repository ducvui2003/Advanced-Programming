package Examples;

public class split {
	public static void main(String[] args) {
		String[] tokens = "Java#HTML#`1Perl".split("#");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i] + " ");
		}
		System.out.println(tokens.length);
	}
}
