interface InputDevice {
    void connect();
}

class Keyboard implements InputDevice {

    public void connect() {
        System.out.println("Keyboard Connected");
    }
}

class Computer {

    InputDevice device;


    Computer(InputDevice device) {
        this.device = device;
    }

    void start() {
        device.connect();
        System.out.println("Computer Started");
    }
}

public class DeviceDIP {

    public static void main(String[] args) {

        InputDevice keyboard = new Keyboard();
        Computer computer = new Computer(keyboard);

        computer.start(); 
    }  
}