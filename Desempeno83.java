// The "Desempeno83" class.
import java.awt.*;
import hsa.Console;

public class Desempeno83
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int[] vector1 = {2, 6, 3, 8, 9,5,2,1,2,4,1};
		// vector1 = new int [4];
	int f, mayor;
	mayor = 0;
	for (f = 0 ; f < vector1.length ; f++)
	{
	    if (vector1[f] > vector1[5])
	    {
		mayor++;
	    } 
	}
		c.println("vectores mayores al quinto: " + mayor);
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno83 class
