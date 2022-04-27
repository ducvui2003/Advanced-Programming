package examples;


public class RandomSuffling {
	public static void main(String[] args) {
		double[] myList = new double[10];
		
		for (int i = 0; i < myList.length; i++) {

			int index = (int) (Math.random()*myList.length);
//		 Swap
			double temp = myList[i];
			myList[i] = myList[index];
			myList[index] = temp;
			System.out.println(myList[i]+"\n"+myList[index]);
		}
	}
}
