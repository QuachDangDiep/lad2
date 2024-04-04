package lab02;
/**
        * Write a description of class FlashLamp here.
        *
        * @author (your name)
 * @version (a version number or a date)
 */

public class flashLamp {
    /**
     * Fields
     */
    private boolean status;
    private battery battery;
    //" Đặt object Battery vao flashLamp vẫn chạy tốt -> LTHDT"
    /**
     * Constructor for objects of class FlashLamp
     */
    public flashLamp(){
        // To do:
        status=false;
    }
    /**
     * Methods
     */
    public void setbattery(battery battery) {
        this.battery = battery;
    }
    public int getbatteryInfo(){
        return battery.getEnergy();
    }
    public void light(){
        if (status==true&&battery!=null&&battery.getEnergy()>0){
            battery.decreaseEnergy();
        }
    }
    public void turnOn(){
        if (battery!=null&&battery.getEnergy()>0){
            status=true;
        }
        light();
    }
    public void turnOff(){
        status=false;
    }
}
