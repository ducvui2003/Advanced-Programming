package exercises;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
// nextLine: Tính cả một chuỗi nhập kể cả dấu cách là một string
		StringBuilder string = new StringBuilder(sc.nextLine());
		System.out.println("Đổi chuỗi " + string + " sang chữ in:" + upperCase(string));
		System.out.println(
				"Đổi các kí tự đầu của từ thành chữ in, chữ còn lại là chữ thường: " + upperCaseFirstLetter(string));
		System.out.println("Xóa các khoảng trắng thừa trong chuỗi: " + deleteBackspace(string));
	}

	private static String upperCase(StringBuilder stringBuilder) {
		String string = stringBuilder.toString();
		return string.toUpperCase();
	}

	private static String upperCaseFirstLetter(StringBuilder stringBuilder) {
//		Tạo một biến dùng để nối các letters thành string
		String concatTokens = "";
//		Đổi stringBuilder => String để dùng split
		String string = stringBuilder.toString();
		String[] tokens = string.split(" ");
		for (int i = 0; i < tokens.length; i++) {
//		Tách các tokens thành các kí tự
			char[] chars = tokens[i].toCharArray();
//			Dùng để upperCase index chars đầu tiên
			chars[0] = Character.toUpperCase(chars[0]);
			tokens[i] = String.valueOf(chars);
			concatTokens = concatTokens + tokens[i] + " ";
		}
		return concatTokens;
	}

	private static String deleteBackspace(StringBuilder stringBuilder) {
		String concatTokens = "";
		String string = stringBuilder.toString();
		String[] tokens = string.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = tokens[i].trim();
			concatTokens = concatTokens + tokens[i] + " ";
		}
		return concatTokens;
	}
}
