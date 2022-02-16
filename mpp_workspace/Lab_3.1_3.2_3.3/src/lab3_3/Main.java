package lab3_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Company ibm = new Company("IBM");
		
		//Create Department Objs 
		Department deptTop = new Department("Top", "HH Tower Level 9");
		Department deptSales = new Department("Sales", "HH Tower Level 9");
		Department deptMarketing = new Department("Marketing", "HH Tower Level 25");
		
		//Create Postion Objs - title, desc, department, superior
		Position posTopExe = new Position("Top Executive","Top Executive",deptTop,null);
		Position posDeptHeadSales = new Position("Dept Head","Department Head - Sales", deptSales, posTopExe);
		Position posDeptHeadMarkt = new Position("Dept Head","Department Head - Marketing",deptMarketing, posTopExe);
		
		Position posMarktAssit = new Position("Marketing Assistant","Marketing Assistant", deptMarketing,posDeptHeadMarkt );
		
		Position posSupervisor1 = new Position("Supervisor", "Sale Supervisor",deptSales, posDeptHeadSales);
		Position posSupervisor2 = new Position("Supervisor", "Sale Supervisor",deptSales, posDeptHeadSales);
		Position posSalesPerson1 = new Position("Sales Person", "Sales Person",deptSales, posSupervisor1 );
		Position posSalesPerson2 = new Position("Sales Person", "Sales Person",deptSales, posSupervisor1);
		Position posSalesPerson3 = new Position("Sales Person", "Sales Person",deptSales, posSupervisor2);
		Position posSalesPerson4 = new Position("Sales Person", "Sales Person",deptSales, posSupervisor2);
		Position posSalesPerson5 = new Position("Sales Person", "Sales Person", deptSales, posSupervisor2);
		
		//add inferior list to position
		ArrayList<Position> infListTopExe = new ArrayList<Position>(Arrays.asList(new Position[] {posDeptHeadSales, posDeptHeadMarkt, posSupervisor1, posSupervisor2, posMarktAssit, posSalesPerson1, posSalesPerson2,posSalesPerson3,posSalesPerson4,posSalesPerson5}));
		ArrayList<Position> infListDeptHeadMarkt = new ArrayList<Position>(Arrays.asList(new Position[] {posMarktAssit}));
		ArrayList<Position> infListDeptHeadSales = new ArrayList<Position>(Arrays.asList(new Position[] {posSupervisor1, posSupervisor2,posSalesPerson1, posSalesPerson2,posSalesPerson3,posSalesPerson4,posSalesPerson5}));
		ArrayList<Position> infListSaleSupervisor1 = new ArrayList<Position>(Arrays.asList(new Position[] {posSalesPerson1, posSalesPerson2}));
		ArrayList<Position> infListSaleSupervisor2 = new ArrayList<Position>(Arrays.asList(new Position[] {posSalesPerson3,posSalesPerson4,posSalesPerson5}));
				
		posTopExe.addInferiorList(infListTopExe);
		posDeptHeadMarkt.addInferiorList(infListDeptHeadMarkt);
		posDeptHeadSales.addInferiorList(infListDeptHeadSales);
		posSupervisor1.addInferiorList(infListSaleSupervisor1);
		posSupervisor2.addInferiorList(infListSaleSupervisor2);
		posMarktAssit.addInferiorList(null);
		posSalesPerson1.addInferiorList(null);
		posSalesPerson2.addInferiorList(null);
		posSalesPerson3.addInferiorList(null);
		posSalesPerson4.addInferiorList(null);
		posSalesPerson5.addInferiorList(null);
		
		//Create Employee - int id, String fn, String mi, String ln, int yearOfBirth, int monthOfBirth, int dayOfBirth, long ssn, double sal, Position position)
		Employee lyle  = new Employee(1, "Lyle", "", "Smith", 1980, 06, 01,"123-45-6789",14500.00, posTopExe);
		Employee anne = new Employee(2, "Anne", "Roslyn", "Jane", 1988, 10, 20,"123-45-6789",6500.00, posDeptHeadMarkt);		
		Employee gary = new Employee(3, "Gary", "Junior", "Moore", 1987, 10, 20,"123-45-6789",3500.00, posMarktAssit);
		
		Employee ron = new Employee(4, "Ron", "Bob", "Smith", 1997, 05, 11,"123-45-6789",6500.00, posDeptHeadSales);
		Employee peter = new Employee(5, "Peter", "", "William", 1987, 10, 20,"123-45-6789",4500.00, posSupervisor1);
		Employee dan = new Employee(6, "Dan", "Edison", "Brown", 1987, 10, 20,"123-45-6789",3500.00, posSalesPerson1);
		Employee bill = new Employee(7, "Bill", "", "Gates", 1987, 10, 20,"123-45-6789",3500.00, posSalesPerson2);
		
		Employee stan = new Employee(8, "Stan", "", "O'reily", 1987, 10, 20,"123-45-6789",4500.00, posSupervisor2);
		Employee mark = new Employee(9, "Marc", "", "Yang", 1987, 10, 20,"123-45-6789",3500.00, posSalesPerson3);
		Employee sue = new Employee(10, "Sue", "", "Cherry", 1987, 10, 20,"123-45-6789",3500.00, posSalesPerson4);
		Employee tom = new Employee(11, "Tom", "", "Hiddleton", 1987, 10, 20,"123-45-6789",3500.00, posSalesPerson5);
		
		//add employee to respective position
		posTopExe.addEmployee(lyle);
		posDeptHeadSales.addEmployee(ron);
		posDeptHeadMarkt.addEmployee(anne);
		posMarktAssit.addEmployee(gary);
		posSupervisor1.addEmployee(peter);
		posSalesPerson1.addEmployee(dan);
		posSalesPerson2.addEmployee(bill);
		posSupervisor2.addEmployee(stan);
		posSalesPerson3.addEmployee(mark);
		posSalesPerson4.addEmployee(sue);
		posSalesPerson5.addEmployee(tom);
		
		//add positions to departments
		deptTop.addPosition(posTopExe);
		
		deptSales.addPosition(posDeptHeadSales);
		deptSales.addPosition(posSupervisor1);
		deptSales.addPosition(posSupervisor2);
		deptSales.addPosition(posSalesPerson1);
		deptSales.addPosition(posSalesPerson2);
		deptSales.addPosition(posSalesPerson3);
		deptSales.addPosition(posSalesPerson4);
		deptSales.addPosition(posSalesPerson5);
		
		deptMarketing.addPosition(posDeptHeadMarkt);
		deptMarketing.addPosition(posMarktAssit);	
		
		ibm.addDepartment(deptTop);
		ibm.addDepartment(deptSales);
		ibm.addDepartment(deptMarketing);	
				
		//ibm.print();
		//double ttSal = ibm.getSalary();
		ibm.printReportingHierarchy();
		//posTopExe.printDownLine();
		//print hirer
		
		
	}

}
