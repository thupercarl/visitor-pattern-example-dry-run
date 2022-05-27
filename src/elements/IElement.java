package elements;

import visitors.IHealthInspector;

/**
 * This interface is designed to be used with business objects
 * @author Jake Donaldson
 * @version 5/27/22
 */
public interface IElement
{

    /**
     * @param healthInspector Visitor object to be allowed access
     * @return String representing inspection results
     */
    String accept(IHealthInspector healthInspector);
}
