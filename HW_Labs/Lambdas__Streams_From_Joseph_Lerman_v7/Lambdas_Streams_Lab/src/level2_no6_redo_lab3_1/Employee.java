package level2_no6_redo_lab3_1;

import java.time.LocalDate;

public 	class Employee {
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate birthDate;
	private String sSN;
	private double salary;
	private Position position;
	
	public Employee(int id, String fn, String mi, String ln, int yearOfBirth, int monthOfBirth, int dayOfBirth, String ssn, double sal, Position position)
	{
		this.employeeId = id;
		this.firstName = fn;
		this.middleInitial = mi;
		this.lastName = ln;
		this.sSN = ssn;
		this.salary = sal;
		this.position = position;
		this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
	}
	
	public void print() {
		System.out.printf("%s%n",firstName + " " + middleInitial + (middleInitial !="" ? " " : "") + lastName + ", " + birthDate + ", " + sSN + ", " + salary  );
	}
	
}
