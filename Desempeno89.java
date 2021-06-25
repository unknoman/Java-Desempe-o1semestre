// The "Desempeno89" class.
import java.awt.*;
import hsa.Console;

public class Desempeno89
{
    static Console c;           // The output console
    String[] nombres;
    double[] precios;

    Desempeno89 ()
    {
	nombres = new String [5];
	precios = new double [5];
    }


    double numero;

    void cargarDatos ()
    {
	int i;
	c.println ("Ingresa un numero");
	numero = c.readDouble ();
	c.println ("Ingresa los datos del producto: ");
	for (i = 0 ; i < precios.length ; i++)
	{
	    c.println ("Ingresa el nombre: ");
	    nombres [i] = c.readString ();
	    c.println ("Ingresa el precio: ");
	    precios [i] = c.readDouble ();
	}
    }


    void operacion ()
    {
    int i;
	for (i = 0 ; i < precios.length ; i++)
	{
	  if (precios[i] > numero)
	  {
	  c.println("Productos con mayor precio al precio: " + numero + " " + nombres[i]);
	  }
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno89 e = new Desempeno89 ();
	e.cargarDatos ();
	e.operacion();
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno89 class
