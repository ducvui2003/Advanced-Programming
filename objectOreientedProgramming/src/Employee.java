import java.util.Arrays;

public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

//Compare Employee by salary
//	@Override
//	public int compareTo(Employee other) {
//		if (this.salary < other.salary) {
//			return -1;
//		}
//		if (this.salary > other.salary) {
//			return 1;
//		}
//		return 0;
//	}
//Compare Employee by name
	@Override
	public int compareTo(Employee other) {
		return this.name.compareToIgnoreCase(other.name);
	}

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Tony Tester", 3800);
		staff[1] = new Employee("Harry Hacker", 3500);
		staff[2] = new Employee("Carl Cracker", 7500);

		Arrays.sort(staff);
//		Print array
		for (Employee employee : staff) {
			System.out.println("name = " + employee.getName() + "\tsalary = " + employee.getSalary());
		}
	}
}
