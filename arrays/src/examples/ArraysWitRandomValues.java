package examples;

public class ArraysWitRandomValues {
	public static void main(String[] args) {
		double[] myList = new double[10];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = Math.random() * 100;
			System.out.println(myList[i]);
		}
	}
}
