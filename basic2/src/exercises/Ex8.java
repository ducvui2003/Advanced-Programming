package exercises;

import java.util.Random;

public class Ex8 {
	public static void main(String[] args) {
		Random rd = new Random();
		int year = rd.nextInt(2500);
		System.out.print("Year: " + year+"\n");
		String can = "";
		String chi = "";
		switch ((year - 3) % 10) {
		case 1: {
			can = "Giap";
			break;
		}
		case 2: {
			can = "At";
			break;
		}
		case 3: {
			can = "Binh";
			break;
		}
		case 4: {
			can = "Dinh";
			break;
		}
		case 5: {
			can = "Mau";
			break;
		}
		case 6: {
			can = "Ky";
			break;
		}
		case 7: {
			can = "Canh";
			break;
		}
		case 8: {
			can = "Tan";
			break;
		}
		case 9: {
			can = "Nham";
			break;
		}
		default:
			can = "Quy";
		}
		switch ((year - 3) % 10) {
		case 1: {
			chi = "Ty";
			break;
		}
		case 2: {
			chi = "Suu";
			break;
		}
		case 3: {
			chi = "Dan";
			break;
		}
		case 4: {

			chi = "Mao";
			break;
		}
		case 5: {
			chi = "Thin";
			break;
		}
		case 6: {
			chi = "Ti";
			break;
		}
		case 7: {
			chi = "Ngo";
			break;
		}
		case 8: {
			chi = "Mui";
			break;
		}
		case 9: {
			chi = "Than";
			break;
		}
		case 10: {
			chi = "Dau";
			break;
		}
		case 11: {
			chi = "Tuat";
			break;
		}
		default:
			chi = "Hoi";
		}
		System.out.println("Lunnar year of " + year + " is " + can + " " + chi);
	}
}
