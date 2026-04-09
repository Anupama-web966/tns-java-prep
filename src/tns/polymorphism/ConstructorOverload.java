package tns.polymorphism;

class Student {
	    private String name;
	    private int age;

	    // Constructor 1
	    Student() {
	        name = "Unknown";
	        age = 0;
	    }

	    // Constructor 2
	    Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	public class ConstructorOverload{
	    public static void main(String[] args) {
	        Student s1 = new Student();             
	        Student s2 = new Student("Anu", 20);

	        s1.display();
	        s2.display();
	    
	}
}
