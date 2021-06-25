// The "Vectores" class.
import java.awt.*;
import hsa.Console;

public class Vectores
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	int[] precios;
	precios = new int [5];
	int f, cien, entre, mayor;
	cien = entre = mayor = 0;
	c = new Console ();
	for (f = 0 ; f < precios.length ; f++)
	{
	    c.println ("Ingresa el precio del producto " + f + " :");
	    precios [f] = c.readInt ();
	}
	for (f = 0 ; f < precios.length ; f++)
	{
	    if (precios [f] < 100)
	    {
		cien++;
	    }
	    if (precios [f] >= 100 && precios [f] <= 200)
	    {
		entre++;
	    }
	    if (precios [f] > 200)
	    {
		mayor++;
	    }
	}
		    c.println("Precios menores a 100 " +cien);
		    c.println("Precios entre 100 y 200 " +entre);
		    c.println("Precios mayores a 200 " +mayor);
	// Place your program here.  'c' is the output console
    } // main method
} // Vectores class


