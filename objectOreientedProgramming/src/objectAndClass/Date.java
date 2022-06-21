package objectAndClass;

public class Date {
	public static void main(String[] args) {
		int elapseTime = 100000;//khong thoi gian troi qua (s)
		for (int i = 0; i < 8; i++) {
			java.util.Date date = new java.util.Date(elapseTime);
			System.out.println(date.toString());
			elapseTime *= 100;
		}
	}
}
