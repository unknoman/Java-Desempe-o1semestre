// The "Desempeno93" class.
import java.awt.*;
import hsa.Console;

public class Desempeno93
{
    static Console c;           // The output console

    int[] vector1;
    int[] vector2;
    Desempeno93 ()
    {
	vector1 = new int [5];
	vector2 = new int [5];
    }


    int i;
    void cargar ()
    {
	c.println ("Carga los 5 Elementos");
	for (i = 0 ; i < vector1.length ; i++)
	{
	    c.println ();
	    c.print ("Vector 1" + "[" + i + "]:");
	    vector1 [i] = c.readInt ();
	}
	c.clear ();
	c.println ("Segundo vector");
	for (i = 0 ; i < vector2.length ; i++)
	{
	    c.println ();
	    c.print ("Vector 2" + "[" + i + "]:");
	    vector2 [i] = c.readInt ();
	}
    }


    int a;


    void comparar ()
    {
	for (i = 0 ; i < vector1.length - 1 ; i++)
	{
	    if (vector1 [i] > vector1 [i + 1])
	    {
		int auxiliar;
		auxiliar = vector1 [i];
		vector1 [i] = vector1 [i + 1];
		vector1 [i + 1] = auxiliar;
	    }
	}
	for (a = 0 ; a < vector1.length - 1 ; a++)
	{
	    if (vector2 [a] > vector2 [a + 1])
	    {
		int auxiliar1;
		auxiliar1 = vector2 [a];
		vector2 [a] = vector2 [a + 1];
		vector2 [a + 1] = auxiliar1;
	    }
	}

    }


    void imprimir ()
    {

	c.println ("El elemento del vector 1 mayor es : " + vector1 [i]);
	c.println ("El elemento del vector 2 mayor es : " + vector2 [a]);

    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno93 e = new Desempeno93 ();
	e.cargar ();
	e.comparar ();
	e.imprimir ();
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno93 class
