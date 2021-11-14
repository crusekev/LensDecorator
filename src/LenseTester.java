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
 * LenseTester is a class that creates 3 lens orders and prints information about each order using the toString method.
 */
public class LenseTester
{
    /**
     * Create 3 lens orders and print the information using the toString method.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        // Lens order 1
        System.out.println("\n-- Lens Order 1 --");
        Lenses order1 = new StandardLens();
        order1 = new AntiReflective(order1);
        order1 = new AntiFog(order1);
        System.out.println(order1);

        // Lens order 2
        System.out.println("\n-- Lens Order 2 --");
        Lenses order2 = new HighIndexLens();
        order2 = new AntiScratch(order2);
        order2 = new AntiReflective(order2);
        order2 = new AntiFog(order2);
        order2 = new UVProtection(order2);
        System.out.println(order2);

        // Lens order 3
        System.out.println("\n-- Lens Order 3 --");
        Lenses order3 = new PolycarbonateLens();
        order3 = new UVProtection(order3);
        order3 = new LensTint(order3);
        System.out.println(order3);
    }
}
