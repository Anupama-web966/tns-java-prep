package tns.polymorphism;

class overloading{
	int add(int a,int b) {
		return a+b;
	}
    double add(double a,double b) {
    	return a+b;
    }
    int add(int a,int b,int c) {
    	return a+b+c;
    }  
}
public class Calculator{
public static void main(String[] args) {
	overloading c=new overloading();
	System.out.println(c.add(1,3));
	System.out.println(c.add(4.3,7.5));
	System.out.println(c.add(1,2,3));
}
}