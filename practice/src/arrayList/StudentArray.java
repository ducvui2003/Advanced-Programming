package arrayList;

public class StudentArray {
	final int NUMBER_OF_STUDENTS = 100;
	private int current = 0;
	private Student[] arrayStudent;

	public StudentArray() {
		this.arrayStudent = new Student[NUMBER_OF_STUDENTS];
	}

	public void add(Student s) {
		arrayStudent[current] = s;
		current++;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < current; i++) {
			sb.append(arrayStudent[i].toString() + "\n");
		}
		return sb.toString();
	}
}
