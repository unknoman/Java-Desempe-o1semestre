// The "Desempeno96" class.
import java.awt.*;
import hsa.Console;

public class Desempeno96
{
    static Console c;           // The output console
    int[] v;
    Desempeno96 ()
    {
	v = new int [6];
    }


    int i, aux;
    void datos ()
    {
	for (i = 0 ; i < v.length ; i++)
	{
	    v [i] = 10 + (int)(Math.random() * 80) + 1;
	}
    }


    void acomodar ()
    {
    int a;
	for (a = 0 ; a < 4 ; a++)
	{
	    for (i = 0 ; i < v.length - 1 ; i++)
	    {
		if (v [i] > v [i + 1])
		{
		    aux = v [i];
		    v [i] = v [i + 1];
		    v [i + 1] = aux;
		}
	    }
	}
	c.println();
	for (i = 0 ; i < v.length ; i++)
	{
	    c.println (v [i]);
	}
	 c.println(" rango: " + v [0] + ", " + v[5]);
    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno96 e = new Desempeno96 ();
	e.datos ();
	e.acomodar ();
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno96 class
