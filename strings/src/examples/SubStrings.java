package examples;

public class SubStrings {
	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		System.out.println(s1.substring(0, 11));
		System.out.println(s1.substring(11));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("   WelCome  to   Java    ".trim());
		System.out.println(s1.replace('e', 'a'));
		System.out.println(s1.replaceFirst("e", "AB"));
	}
}
