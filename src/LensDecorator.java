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
 * LensDecorator is an abstract class that extends the Lenses abstract class.
 */
public abstract class LensDecorator extends Lenses
{
    /**
     *
     * getDescription is an abstract method that is implemented in the decorator classes and facilitates the combining of descriptions.
     */
    @Override
    public abstract String getDescription();
}
