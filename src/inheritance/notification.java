package inheritance;

public class notification {
    String mess="default notif";
}
class pushnotification extends notification{
	String mess="push notification";
	void display() {
	   System.out.println("child"+mess);
	   System.out.println("parent"+ super mess);
	}
}
public class not{
	public static void main(String[] args) {

	}
}