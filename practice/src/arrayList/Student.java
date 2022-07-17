package arrayList;

public class Student {
	private int id;
	private String name;
	private Date dob;
	private String classRoom;

	public Student(int id, String name, Date dob, String classRoom) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", dob: " + dob.toString() + ", Class: " + classRoom;
	}

	public int getId() {
		return id;
	}
	
}
