package level2_no6_redo_lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private List<Position> posList = new ArrayList<Position>();
	
	public Department(String name, String location){
		this.name = name;
		this.location = location;
	}	
	public void addPosition(Position p) {
		posList.add(p);
	}
	public void print() {
		System.out.printf("%s%n", "Department : " + name + " located at " + location);
		//----------------
		// lambda & stream
		//----------------
		posList.stream().forEach(Position::print);
		
//		for(int i = 0; i <posList.size(); i++) {
//			posList.get(i).print();
//		}
	}
}
