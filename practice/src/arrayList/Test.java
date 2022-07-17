package arrayList;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		StudentArray stdList = new StudentArray();

		Scanner sc = new Scanner(System.in);
		int id;
		String name, dob, classRoom;

//		Infinite Loop 
		while (true) {
			System.out.print("- Enter id of student: ");
			id = sc.nextInt();
			System.out.print("- Enter name of student: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("- Enter date of birth day (dd/mm/yyyy): ");
			dob = sc.nextLine();

//		Handle date;
			String[] dobArray = dob.split("/");
			Date date = new Date(Integer.parseInt(dobArray[0]), Integer.parseInt(dobArray[1]),
					Integer.parseInt(dobArray[2]));

			System.out.print("- Enter class room: ");
			classRoom = sc.nextLine();

			Student s = new Student(id, name, date, classRoom);

			stdList.add(s);

//		Break while	
			System.out.print("- Do you want to continue (Enter 0 to pause)?: ");
			int check = sc.nextInt();
			if (check == 0) {
				break;
			}
		}
		System.out.println("List students: \n" + stdList);
	}
}
