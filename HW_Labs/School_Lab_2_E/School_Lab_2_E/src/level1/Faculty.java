package level1;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
	private double salary;
	private List<Course> courses = new ArrayList<Course>();
	

	Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
	}	
	public int getTotalUnits() {
		int sumUnits = 0;
		//lambda
		//courses.forEach( c -> sumUnits += c.getUnits());
		for(Course c: courses) {
			sumUnits += c.getUnits();
		}
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
