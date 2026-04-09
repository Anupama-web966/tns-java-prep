package tns.polymorphism;

class Person1{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("name"+name);
	}
}
public class Person {
	public static void main(String[]args) {
	Person1 p=new Person1();
	p.setName("alia");
	p.getName();
	p.display();
}
}