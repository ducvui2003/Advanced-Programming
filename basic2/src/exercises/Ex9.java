package exercises;

import java.util.Random;

public class Ex9 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(1000);
		System.out.println("Number: "+number);
		String number1Digit = "";
		String number2Digit = "";
		String number3Digit = "";
		if (number < 10) {
			switch (number) {
			case 1: {
				number1Digit = "mot";
				break;
			}
			case 2: {
				number1Digit = "hai";
				break;
			}
			case 3: {
				number1Digit = "ba";
				break;
			}
			case 4: {
				number1Digit = "bon";
				break;
			}
			case 5: {
				number1Digit = "nam";
				break;
			}
			case 6: {
				number1Digit = "sau";
				break;
			}
			case 7: {
				number1Digit = "bay";
				break;
			}
			case 8: {
				number1Digit = "tam";
				break;
			}
			case 9: {
				number1Digit = "chin";
				break;
			}
			default:
				number1Digit = "khong";
			}
			System.out.println(number1Digit);
		}
		if (number >= 10 && number < 99) {
			switch (number / 10) {
			case 1: {
				number2Digit = "muoi";
				break;
			}
			case 2: {
				number2Digit = "hai";
				break;
			}
			case 3: {
				number2Digit = "ba";
				break;
			}
			case 4: {
				number2Digit = "bon";
				break;
			}
			case 5: {
				number2Digit = "nam";
				break;
			}
			case 6: {
				number2Digit = "sau";
				break;
			}
			case 7: {
				number2Digit = "bay";
				break;
			}
			case 8: {
				number2Digit = "tam";
				break;
			}
			default:
				number2Digit = "chin";
			}
			switch (number % 10) {
			case 1: {
				number1Digit = "muoi mot";
				break;
			}
			case 2: {
				number1Digit = "muoi hai";
				break;
			}
			case 3: {
				number1Digit = "muoi ba";
				break;
			}
			case 4: {
				number1Digit = "muoi bon";
				break;
			}
			case 5: {
				number1Digit = "muoi nam";
				break;
			}
			case 6: {
				number1Digit = "muoi sau";
				break;
			}
			case 7: {
				number1Digit = "muoi bay";
				break;
			}
			case 8: {
				number1Digit = "muoi tam";
				break;
			}
			case 9: {
				number1Digit = "muoi chin";
				break;
			}
			default:
				number1Digit = "muoi";
			}
			System.out.println(number2Digit + " " + number1Digit);
		}

//		number 3 digits (100 < number < 1000)
//		digit 3
		if (number >= 100 && number < 1000) {
			switch (number / 100) {
			case 1: {
				number3Digit = "mot tram";
				break;
			}
			case 2: {
				number3Digit = "hai tram";
				break;
			}
			case 3: {
				number3Digit = "ba tram";
				break;
			}
			case 4: {
				number3Digit = "bon tram";
				break;
			}
			case 5: {
				number3Digit = "nam tram";
				break;
			}
			case 6: {
				number3Digit = "sau tram";
				break;
			}
			case 7: {
				number3Digit = "bay tram";
				break;
			}
			case 8: {
				number3Digit = "tam tram";
				break;
			}
			default:
				number3Digit = "chin tram";
			}
//		digit 2
			switch (number % 100 / 10) {
			case 1: {
				number2Digit = "muoi";
				break;
			}
			case 2: {
				number2Digit = "hai muoi";
				break;
			}
			case 3: {
				number2Digit = "ba muoi";
				break;
			}
			case 4: {
				number2Digit = "bon muoi";
				break;
			}
			case 5: {
				number2Digit = "nam muoi";
				break;
			}
			case 6: {
				number2Digit = "sau muoi";
				break;
			}
			case 7: {
				number2Digit = "bay muoi";
				break;
			}
			case 8: {
				number2Digit = "tam muoi";
				break;
			}
			case 9: {
				number2Digit = "chin muoi";
				break;
			}
			default:
				if (number % 10 == 0) {
					number2Digit = "";
				} else {
					number2Digit = "linh";
				}
			}
//		digit 1
			if (number % 100 < 10) {
				switch (number % 100) {
				case 1: {
					number1Digit = "mot";
					break;
				}
				case 2: {
					number1Digit = "hai";
					break;
				}
				case 3: {
					number1Digit = "ba";
					break;
				}
				case 4: {
					number1Digit = "bon";
					break;
				}
				case 5: {
					number1Digit = "nam";
					break;
				}
				case 6: {
					number1Digit = "sau";
					break;
				}
				case 7: {
					number1Digit = "bay";
					break;
				}
				case 8: {
					number1Digit = "tam";
					break;
				}
				case 9: {
					number1Digit = "chin";
					break;
				}
				default:
					number1Digit = "";
				}
			} else {
				switch (number % 100 % 10) {
				case 1: {
					number1Digit = "muoi mot";
					break;
				}
				case 2: {
					number1Digit = "muoi hai";
					break;
				}
				case 3: {
					number1Digit = "muoi ba";
					break;
				}
				case 4: {
					number1Digit = "muoi bon";
					break;
				}
				case 5: {
					number1Digit = "muoi nam";
					break;
				}
				case 6: {
					number1Digit = "muoi sau";
					break;
				}
				case 7: {
					number1Digit = "muoi bay";
					break;
				}
				case 8: {
					number1Digit = "muoi tam";
					break;
				}
				case 9: {
					number1Digit = "muoi chin";
					break;
				}
				default:
					number1Digit = "";
				}
			}
			System.out.println(number3Digit + " " + number2Digit + " " + number1Digit);
		}
	}
}
