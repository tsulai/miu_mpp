package level2_no5_redo_school_lab2_level2;

public class Course {
	private String number;
	private String title;
	private int units;
	
	Course(String number, String title, int units){
		this.number = number;
		this.title = title;
		this.units = units;
	}
	public int getUnits() {
		return units;
	}
	public String getCourseNumber() {
		return number;
	}
}
