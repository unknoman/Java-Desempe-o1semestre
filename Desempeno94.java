// The "Desempeno94" class.
import java.awt.*;
import hsa.Console;

public class Desempeno94
{
    static Console c;           // The output console
    int[] vector1;

    Desempeno94 ()
    {
	vector1 = new int [5];
    }

   int i;
    void ingresarValores ()
    {
	c.println ("Ingresa los valores: ");
	    for (i = 0 ; i < vector1.length ; i++)
	{
	c.print("Ingresa el valor: [" + i + "]: " );
	    vector1 [i] = c.readInt ();
	}
    }

    void imprimirDatos()
    {
    for(i = vector1.length - 1; i >= 0; i--)
    {
    c.println(vector1[i]);
    }
    }

    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno94 e = new Desempeno94 ();
	e.ingresarValores();
	e.imprimirDatos();
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno94 class
