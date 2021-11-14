/*
Name: Kevin Cruse
Class: CS321-02
Date: November 14, 2021
Description: This program uses the Decorator pattern to represent lens orders for
eyeglasses with various lens options. There are 3 base lenses, and a number of
extras (such as coatings) that can be purchased along with the base lenses. The
lens extras are your decorators. Lens extras can increase the cost of the lens
as well as the time it takes to make the lens.

Each lens object has a method that returns a description of the lens, a
method that returns the cost of the lens, and a method that returns the total
time it will take to make the lens (in days). In addition, a toString() method
returns all the details of your lens
(description, cost, and number of days to make) as a string. Cost and time are
for a pair of lenses, rather than per lens. The cost and time to add lens extras
are in addition to the base lens cost and time to make.
*/

/**
 * Lenses is an abstract class that implements getDescription() and toString(), while leaving the undecorated Lens classes to implement the cost() and totalTime() methods.
 */
public abstract class Lenses
{
    public String getDescription()
    {
        return description;
    }

    /**
     * cost is an abstract method used for returning the cost as an int and is implemented in the undecorated Lens classes.
     */
    public abstract int cost();

    /**
     * totalTime is an abstract method used for returning the time to make each lens and is implemented in the undecorated Lens classes.
     */
    public abstract int totalTime();

    /**
     * toString is a method that returns all the details of the lens (description, cost, and number of days to make) as a string.
     *
     * @return a String representation of the details of the lens.
     */
    public String toString()
    {
        return ("\nLens description: " + getDescription() + "\nTime to make: " + totalTime() + " days" + "\nLens cost $" + cost());
    }

    /**
     * description is a String used to store the lens description.
     */
    String description = "Unknown lenses";

    /**
     * cost is an int used to store the cost of the lens.
     */
    int cost;

    /**
     * totalTime is an int used to store the time to make the lens.
     */
    int totalTime;
}
