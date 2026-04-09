package tns.polymorphism;

class Brother {
	    int a=9;
        void drink() {
        	System.out.println("tea");
        }
}
class son extends Brother{
	@Override
	void drink() {
		System.out.println("old monk");
	}
}
public class Father{
public static void main(String[]args) {
	son s =new son();
	s.drink();
}
}
