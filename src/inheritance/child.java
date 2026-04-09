package inheritance;

public class child extends father{
     String cycle="pink";
     void read() {
    	 System.out.println("java");
     }

public static void main(String[] args) {
     child c= new child();
     System.out.println(c.money);
     System.out.println(c.cycle);
     c.drink();
     }

}
