package arrayList;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> lstStudent = new ArrayList<Student>();

	public void add(Student s) {
		lstStudent.add(s);
	}

	public boolean find(int id) {
		for (int i = 0; i < lstStudent.size(); i++) {
			if (lstStudent.get(i).getId() == id)// get = index
				return true;
		}
		return false;
	}

	public Student findStudent(int id) {
		for (int i = 0; i < lstStudent.size(); i++) {
			if (lstStudent.get(i).getId() == id)
				return lstStudent.get(i);
		}
		return null;
	}

//	ToString using for-each (Can use for)
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Student s : lstStudent) {
			sb.append(s.toString() + "\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		StudentList stdList = new StudentList();// default constructor
		stdList.add(new Student(1, "Le Anh Duc", new Date(15, 8, 2003), "DH21DTB"));
		stdList.add(new Student(1, "Le Quang Nhat", new Date(15, 7, 2013), "DH21DTB"));
		System.out.println(stdList.toString());
	}
}
