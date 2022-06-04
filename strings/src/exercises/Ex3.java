
package exercises;


public class Ex3 {

	public static String firstIndexS1MatchS2(String s1, String s) {
		char firstCharS1 = s1.charAt(0);
		char[] s2ToChar = s.toCharArray();
		for (int i = 0; i < s2ToChar.length; i++) {
			if (firstCharS1 == s2ToChar[i]) {
				return "Index the frist char of s1 match with s " + i;
			}
		}
		return "Can't find";
	}

	public static void main(String[] args) {
		String s1 = "s";
		String s = RandomStrings.getString();
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s);
		System.out.println(firstIndexS1MatchS2(s1, s));
	}
}
