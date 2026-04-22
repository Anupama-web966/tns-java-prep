package tns.pack;

// Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
    void getStatus();
}

// Implementation class
class SmartLight implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Light ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light OFF");
    }

    @Override
    public void getStatus() {
        System.out.println("Smart Light is working");
    }
}

// Main class
public class SmartDevice {
    public static void main(String[] args) {

        
        SmartDevice device = new SmartLight();

        device.turnOn();
        device.turnOff();
        device.getStatus();
    }
}