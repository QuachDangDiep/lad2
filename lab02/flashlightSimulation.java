package lab02;

public class flashlightSimulation {
    public static void main(String[] args) {
        battery battery= new battery();

        flashLamp flashLamp = new flashLamp();

        flashLamp.setbattery(battery);

        for (int i=0;i<10;i++){
            flashLamp.turnOn();
            System.out.println("Flashlight is turned on.");
            System.out.println("Remaining battery power: "+flashLamp.getbatteryInfo());
            flashLamp.turnOff();
            System.out.println("Flashlight is turned off");

        }

    }
}
