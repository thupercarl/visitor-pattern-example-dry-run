package visitors;

import elements.Chipotle;
import elements.Walmart;

/**
 * This class is designed to represent a concrete visitor
 * @author Jake Donaldson
 * @version 5/27/22
 */
public class HealthInspector implements IHealthInspector
{

    public static final int REMEDIAL_SCORE = 75;

    @Override
    public String visit(Walmart walmart)
    {
        if(walmart.isCleanFloors() && walmart.isRecovered())
        {
            return "Walmart = Passed Inspection";
        }

        else
        {
            return "Walmart = Failed Inspection";
        }
    }

    @Override
    public String visit(Chipotle chipotle)
    {
        //cleanliness and freshness are scored out of 100
        if(chipotle.getCleanliness() >= REMEDIAL_SCORE && chipotle.getFreshness() >= REMEDIAL_SCORE)
        {
            return "Chipotle = Passed Inspection";
        }
        else
        {
            return "Chipotle = Failed Inspection";
        }
    }
}
