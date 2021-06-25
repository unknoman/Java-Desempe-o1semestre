// The "Desempeno82" class.
import java.awt.*;
import hsa.Console;

public class Desempeno82
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int[] vector1;
	vector1 = new int [3];
	int[] vector2;
	vector2 = new int [3];
	int[] resultado;
	resultado = new int [3];
	int f;
	for (f = 0 ; f < vector1.length ; f++)
	{
	    c.println ("Ingresa un valor del primer vector ");
	    vector1 [f] = c.readInt ();
	}
	c.println ("Segundo Vector");
	for (f = 0 ; f < vector2.length ; f++)
	{
	    c.println ("Ingresa un valor del segundo vector ");
	    vector2 [f] = c.readInt ();
	}
	for (f = 0 ; f < resultado.length ; f++)
	{
	    resultado [f] = vector1 [f] + vector2 [f];
	    c.println ("resultado " + " " + resultado[f]);
	}

	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno82 class
