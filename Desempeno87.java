// The "Desempeno87" class.
import java.awt.*;
import hsa.Console;

public class Desempeno87
{
    static Console c;           // The output console
    int[] valores;
    int[] valores2;
    int[] valores3;
    int i, promedio, promedio2, promedio3;
    Desempeno87 ()
    {
	valores = new int [5];
	valores2 = new int [5];
	valores3 = new int [5];
    }


    void valores ()
    {
	c.println ("Ingresa los numeros del primer vector");
	for (i = 0 ; i < valores.length ; i++)
	{
	    c.print ("numero [" + (i + 1) + "]");
	    valores [i] = c.readInt ();
	}
	c.println ("Ingresa los numeros del segundo vector");
	for (i = 0 ; i < valores2.length ; i++)
	{
	    c.print ("numero [" + (i + 1) + "]");
	    valores2 [i] = c.readInt ();
	}
	c.println ("Ingresa los numeros del tercer vector");
	for (i = 0 ; i < valores2.length ; i++)
	{
	    c.print ("numero [" + (i + 1) + "]");
	    valores3 [i] = c.readInt ();
	}
    }


    int operacion1 ()
    {
	int suma;
	suma = 0;
	promedio = 0;
	for (i = 0 ; i < valores.length ; i++)
	{
	    suma = suma + valores [i];
	    promedio = suma / 5;
	}
	return promedio;

    }


    int operacion2 ()
    {
	int suma2;
	suma2 = promedio2 = 0;
	for (i = 0 ; i < valores2.length ; i++)
	{
	    suma2 = suma2 + valores2 [i];
	    promedio2 = suma2 / 5;
	}
	return promedio2;
    }


    int operacion3 ()
    {
	int suma3;
	suma3 = promedio3 = 0;
	for (i = 0 ; i < valores3.length ; i++)
	{
	    suma3 = suma3 + valores3 [i];
	    promedio3 = suma3 / 5;
	}
	return promedio3;
    }


    void pantalla ()
    {
	c.clear ();
	c.println ("Primer vector: ");
	for (i = 0 ; i < valores.length ; i++)
	{
	    c.print ("[" + valores [i] + "],");
	}
	c.println ();
	c.println ("Segundo Vector");
	for (i = 0 ; i < valores2.length ; i++)
	{
	    c.print ("[" + valores2 [i] + "],");
	}
	c.println ();
	c.println ("Tercer Vector");
	for (i = 0 ; i < valores3.length ; i++)
	{
	    c.print ("[" + valores3 [i] + "],");
	}
	c.println ();
	c.println ("El promedio del primero vector es: " + operacion1 ());
	c.println ("El promedio del segundo vector es: " + operacion2 ());
	c.println ("El promedio del tercer vector es: " + operacion3 ());
	if (promedio > promedio2 && promedio > promedio3)
	{
	    c.println ("El primer vector tiene el mayor promedio");
	}
	else
	    if (promedio2 > promedio && promedio2 > promedio3)
	    {
		c.println ("El segundo vector tiene el mayor promedio");
	    }
	    else
		if (promedio3 > promedio && promedio3 > promedio2)
		{
		    c.println ("El tercer vector tiene el mayor promedio");
		}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno87 e = new Desempeno87 ();
	e.valores ();
	e.pantalla ();
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno87 class


