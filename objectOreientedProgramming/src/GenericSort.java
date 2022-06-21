import java.util.Arrays;

public class GenericSort {
	public static void main(String[] args) {

		Integer[] intArray = { new Integer(2), new Integer(4), new Integer(3) };

		Double[] doubleArray = { new Double(3.4), new Double(-1.3), new Double(-22.1) };

		Character[] charArray = { new Character('a'), new Character('J'), new Character('r') };

		String[] stringArray = { new String("Tom"), new String("John"), new String("Fred") };

		Arrays.sort(stringArray);
		Arrays.sort(doubleArray);
		Arrays.sort(intArray);
		Arrays.sort(charArray);

		System.out.println("Sort int obj: ");
		printList(intArray);

		System.out.println("Sort double obj: ");
		printList(doubleArray);

		System.out.println("Sort char obj: ");
		printList(charArray);

		System.out.println("Sort String obj: ");
		printList(stringArray);

	}

	private static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
		}
		System.out.println();
	}
}
