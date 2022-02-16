package level2;

import java.time.LocalDate;

public class StaffStudent extends Student{
	private Staff staff;
	private LocalDate firstCourseStartDate = null;

	StaffStudent(String name, String phone, int age, double gpa, double salary) {
		super(name, phone, age, gpa);		
		staff = new Staff(name, phone, age, salary);
	}
	@Override
	public double getSalary() {
		return staff.getSalary();
	}
	
	@Override
	public void addCourse(Course c) {		
		super.addCourse(c);
		if(firstCourseStartDate == null) {
			firstCourseStartDate = LocalDate.now();
			//System.out.println(firstCourseStartDate);
		}
		
	}
}
