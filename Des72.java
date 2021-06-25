// The "Des" class.
import java.awt.*;
import hsa.Console;

public class Des72
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int hombres, mujeres, edad, continuar, edades, sexo;
	edades = 0;
	char opcion = ' ';
	hombres = mujeres = 0;
	do
	{
	    c.println ("Ingresa el Sexo 1- Hombre 2- Mujer ");
	    sexo = c.readInt ();
	    if (sexo == 1 || sexo == 2)
	    {
		if (sexo == 1 )
		{
		    hombres++;
		    c.println ("Edad");
		    edad = c.readInt ();
		    if (edad >= 18)
		    {
			edades++;
		    }
		    c.clear ();
		}
		if (sexo == 2)
		{
		    mujeres++;
		    c.clear ();
		}
	    }
	    else
	    {
		c.println ("Sexo Erroneo");
	    }

	    c.print ("Continuar? (s / n):            ");
	    if (opcion == 'S' || opcion == 's')
		opcion = c.readChar ();
	    opcion = c.readChar ();
	    c.clear ();

	}
	while (opcion == 'S' || opcion == 's');
	c.println ("cantidad de varones " + hombres);
	c.println ("Cantidad de mujeres " + mujeres);
	c.println ("varones mayores o iguales a 18: " + edades);

	// Place your program here.  'c' is the output console
    } // main method
} // Des class
