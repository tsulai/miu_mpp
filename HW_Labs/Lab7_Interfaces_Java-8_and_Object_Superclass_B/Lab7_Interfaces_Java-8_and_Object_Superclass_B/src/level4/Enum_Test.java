package level4;

public class Enum_Test {

	public static void main(String[] args) {
		Person p = new Person("Micheal", "641-819-0000", 33);
		p.setShirtSize(Size.LARGE);
		if(p.getShirtSize() != Size.SMALL) {
			System.out.println("You are good!");
		}
		//-------------
		//What if you have constants that must be of type int or String (or another type)?
		//-------------
		//Dim.LENGTH calls constructor. Then comes the call to val( ) 
		System.out.println("Enum Dim.LENGTH result: " + Dim.LENGTH.val());
		
	}

}
