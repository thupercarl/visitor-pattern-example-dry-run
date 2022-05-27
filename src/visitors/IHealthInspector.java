package visitors;

import elements.Chipotle;
import elements.Walmart;

/**
 * This interface is designed to be used with Visitor objects
 * @author Jake Donaldson
 * @version 5/27/22
 */
public interface IHealthInspector
{

    /**
     * @param chipotle type of business passed
     * @return String representing inspection results
     */
    String visit(Chipotle chipotle);


    /**
     * @param walmart type of business passed
     * @return String representing inspection results
     */
    String visit(Walmart walmart);
}
