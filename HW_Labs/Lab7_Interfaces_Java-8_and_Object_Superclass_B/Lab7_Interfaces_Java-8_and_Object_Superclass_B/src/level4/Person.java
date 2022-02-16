package level4;

public class Person implements IPerson {
	
	protected String name;
	protected String phone;
	protected int age;
	private Size shirtSize = null;
	
	Person(String name, String phone, int age){
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public Size getShirtSize() {
		return shirtSize;
	}
	public void setShirtSize(Size shirtSize) {
		this.shirtSize = shirtSize;
	}
	@Override
	public void myAbstract() {
		System.out.println("Overrided myAbstract method");
		
	}	

}
