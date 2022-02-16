package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position implements Cloneable {
	//The default version of the clone() method creates a shallow copy of an object.
	private String title;
	private String description;
	private Employee employee = null;
	
	public Position(String t, String des) {
		this.title = t;
		this.description = des;
	}
	public Position(String t, String des, Employee e) {
		this.title = t;
		this.description = des;
		this.employee = e;
	}
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void addEmployee(Employee e) {
		this.employee = e;
	}
	
	public void print() {
		System.out.printf("%s", title + " - ");
		if(employee != null) {
			employee.print();
		}else {
			System.out.printf("%s%n","[Position Vacant]");
		}
		
	}
	@Override
	public String toString() {
		return title + ", " + description + ", " + "(" 
				+ (employee != null 
				? "Filled: " + employee.getEmployeeId() + "," + employee.getFirstName() + (employee.getMiddleInitial() == "" ? " " 
				+ employee.getLastName() : employee.getMiddleInitial() + " " + employee.getLastName()) : "Vacant")
				+ ")" + "\n";
	}
	@Override
	public boolean equals(Object p) {
		if(p == null) return false;
		if(! (p instanceof Position)) return false;
		Position pos = (Position) p;
		return pos.title.equals(this.title)
				&& pos.description.equals(this.description);				
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, description);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Position copy = (Position) super.clone();
		copy.employee = (Employee) this.employee.clone();
		return copy;
	}
}
