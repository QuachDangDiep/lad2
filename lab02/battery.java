package lab02;
/**
 * Write a description of class Battery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class battery {
    /**
     * Fields
     */
    private int energy;
    /**
     * Constructor for objects of class Battery
     */
    public battery(){
        // To do:
        energy=100;
    }
    /**
     * Method
     */
    public void setEnergy(int value) {
        this.energy = value;
    }

    public int getEnergy() {
        return energy;
    }
    public void decreaseEnergy(){
        energy--;
    }
}
