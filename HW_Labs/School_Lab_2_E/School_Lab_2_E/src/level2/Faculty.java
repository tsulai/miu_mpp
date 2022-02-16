package level2;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
	private double salary;
	private List<Course> courses = new ArrayList<Course>();
	private int sumUnits = 0;

	Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
	}	
	public int getTotalUnits() {
		courses.forEach( c -> sumUnits += c.getUnits());
		return sumUnits;
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	@Override
	public double getSalary() {
		return salary;
	}

}
