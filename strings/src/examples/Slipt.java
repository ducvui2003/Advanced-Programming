package examples;

public class Slipt {
	public static void main(String[] args) {
		String[] tokens = "Java#HTML#Perl".split("#");
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + " ");
		}
		System.out.println("\n" + tokens.length);
	}
}
