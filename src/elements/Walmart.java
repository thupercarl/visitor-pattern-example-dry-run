package elements;

import visitors.IHealthInspector;

/**
 * This class is designed to be used for the visitor pattern
 * @author Jake Donaldson
 * @version 5/27/22
 */
public class Walmart implements IElement
{
    private boolean isRecovered;
    private boolean cleanFloors;


    /**
     * @param isRecovered whether the shelves in the store are reset
     * @param cleanFloors whether the floors of the store are clean
     */
    public Walmart(boolean isRecovered, boolean cleanFloors)
    {
        this.isRecovered = isRecovered;
        this.cleanFloors = cleanFloors;
    }


    /**
     * @return if the store is recovered
     */
    public boolean isRecovered() {
        return isRecovered;
    }


    /**
     * @return if the floors are clean
     */
    public boolean isCleanFloors() {
        return cleanFloors;
    }

    @Override
    public String accept(IHealthInspector healthInspector){ return healthInspector.visit(this); }

    @Override
    public String toString() {
        return "Walmart{" +
                "isRecovered=" + isRecovered +
                ", cleanFloors=" + cleanFloors +
                '}';
    }
}
