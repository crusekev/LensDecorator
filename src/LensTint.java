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
 * LensTint is a decorator class that extends the abstract class LensDecorator.
 */
public class LensTint extends LensDecorator
{
    /**
     * LensTint is a constructor that is passed a Lenses object which is stored.
     *
     * @param lens is a Lenses object.
     */
    public LensTint(Lenses lens)
    {
        this.lens = lens;
    }

    /**
     * getDescription returns the undecorated lens description and combines it with decorator description.
     *
     * @return a String of the undecorated description combined with the decorated description.
     */
    @Override
    public String getDescription()
    {
        return lens.getDescription() + ", A tint to turn your lenses into sunglass lenses";
    }

    /**
     * cost returns the undecorated lens cost and adds it to the decorated lens cost.
     *
     * @return the undecorated lens cost + the decorated lens cost as an int.
     */
    @Override
    public int cost()
    {
        return lens.cost() + 45;
    }

    /**
     * totalTime returns the time to make the undecorated lens and adds it to the time to make the decorated lens.
     *
     * @return the time to make the undecorated lens + the time to make the decorated lens.
     */
    @Override
    public int totalTime()
    {
        return lens.totalTime() + 3;
    }

    // Create a Lenses object
    private Lenses lens;
}
