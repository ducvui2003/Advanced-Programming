package examples;

public class Test {
	public static void main(String[] args) {
		String s = "Java";
		s = "HTML";
		System.out.println(s);
		String s1 = "Welcome to Java";
		String s2 = new String("wELcome to Java");
		String s3 = "WElcome to Java";
//		System.out.println("s1 == s2 is "+(s1==s2)); 
//		System.out.println("s1 == s3 is "+(s1==s3)); 
		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(0, 11).length());
		System.out.println(s1.substring(0, 11));
		System.out.println(s1.split(s));
		System.out.println(s1.replaceAll(s1, s3 ));
//		System.out.println(s1.concat(s2));
	}
}
