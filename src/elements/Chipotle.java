package elements;

import visitors.IHealthInspector;

/**
 * This class is designed to be used for the visitor pattern
 * @author Jake Donaldson
 * @version 5/27/22
 */
public class Chipotle implements IElement
{
    private int cleanliness;
    private int freshness;


    /**
     * @param cleanliness how clean the store is
     * @param freshness how fresh the food in the restaurant is
     */
    public Chipotle(int cleanliness, int freshness)
    {
        this.cleanliness = cleanliness;
        this.freshness = freshness;
    }


    /**
     * @return how clean the store is
     */
    public int getCleanliness() {
        return cleanliness;
    }

    /**
     * @return how fresh the food in the restaurant is
     */
    public int getFreshness() {
        return freshness;
    }

    @Override
    public String accept(IHealthInspector healthInspector) {
        return healthInspector.visit(this);
    }

    @Override
    public String toString() {
        return "Chipotle{" +
                "cleanliness=" + cleanliness +
                ", freshness=" + freshness +
                '}';
    }
}
