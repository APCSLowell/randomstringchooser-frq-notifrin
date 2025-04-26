import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> valuesRemaining;

    public RandomStringChooser(String[] values)
    {
        valuesRemaining = new ArrayList<String>();

        for(String value : values)
            valuesRemaining.add(value);
}
