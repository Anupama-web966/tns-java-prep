package tns.pack;

interface SmartDevice {
    void turnOn();
    void turnOff();
    void getStatus();
}
class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("light on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	 System.out.println("Light off");
	}

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		System.out.println("smartLight");
	}
	
}
public class InterfaceDemo{
	public static void main(String[] args) {
		SmartLight s =new  SmartLight();
		s.turnOn();
		s.turnOff();
		s.getStatus();	
}
}
