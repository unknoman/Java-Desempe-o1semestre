// The "Desempeno90" class.
import java.awt.*;
import hsa.Console;

public class Desempeno90
{
    static Console c;           // The output console
    int[] v1;
    int[] v2;
    Desempeno90 ()
    {
	v1 = new int [5];
	v2 = new int [5];
    }


    int suma, i;
    int multiplicar ()
    {
	for (i = 0 ; i < v1.length ; i++)
	{
	    suma = suma + v1 [i] * v2 [i];
	}
	return suma;
    }


    void imprimir ()
    {
	for (i = 0;i<v1.length;i++)
	{
	  c.print(v1[i] + " * " + v2[i] + " + " );
	}
	c.println();
	c.println ("suma: " + multiplicar ());
    }


    void ingresarDatos ()
    {
	for (i = 0 ; i < v1.length ; i++)
	{
	    c.println ("Ingresa datos del vector 1: ");
	    v1 [i] = c.readInt ();
	    c.println ("Ingresa datos del vector 2: ");
	    v2 [i] = c.readInt ();
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno90 e = new Desempeno90 ();
	e.ingresarDatos ();
	e.imprimir ();


	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno90 class


