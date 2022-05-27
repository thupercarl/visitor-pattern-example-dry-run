package tryit;

import elements.Chipotle;
import elements.IElement;
import elements.Walmart;
import visitors.HealthInspector;
import visitors.IHealthInspector;

/**
 * This class is designed to be used for the visitor pattern in order to test it
 * @author Jake Donaldson
 * @version 5/27/22
 */
public class Driver
{

    public static final int VERY_CLEAN = 90;
    public static final int KIND_OF_FRESH = 72;
    public static final int VERY_FRESH = 90;
    public static final int SPOILED = 30;
    public static final int FILTHY = 8;

    /**
     * @param args String array that contains program arguments
     */
    public static void main(String[] args)
    {
        IElement[] locations = new IElement[] {
                new Walmart(true, true),
                new Walmart(false, false),
                new Walmart(true, false),
                new Chipotle(VERY_CLEAN, VERY_FRESH),
                new Chipotle(FILTHY, SPOILED),
                new Chipotle(VERY_CLEAN, KIND_OF_FRESH)
        };

        IHealthInspector inspector = new HealthInspector();

        for (IElement location : locations)
        {
            //must call elements' accept methods to allow an inspector to visit them
            System.out.println(location.accept(inspector));
        }
    }
}
