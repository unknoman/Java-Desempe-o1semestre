// The "Desempeno85" class.
import java.awt.*;
import hsa.Console;

public class Desempeno85
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int[] vector = {2, 2, 3, 4, 5};

	int[] vectorpares;
	vectorpares = new int [5];
	int[] vectorimpares;
	vectorimpares = new int [5];

	int f;
	for (f = 0 ; f < vector.length ; f++)
	{
	    if (vector [f] % 2 == 0)
	    {
		vectorpares [f] = vector [f];
	    }
	    else
	    {
		vectorimpares [f] = vector [f];
	    }

	}
	c.println("Pares: ");
	for (f = 0 ; f < vector.length ; f++)
	{
	    if (vectorpares [f] > 0)
	    {
		c.print (vectorpares [f] + " ");
	    }
	}
	c.println();
	c.println("Impares: ");
	for (f = 0 ; f < vector.length ; f++)
	{
	    if (vectorimpares [f] > 0)
	    {
		c.print (vectorimpares [f] + " ");
	    }
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno85 class
