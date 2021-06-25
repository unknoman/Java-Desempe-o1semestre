// The "Desempeno88" class.
import java.awt.*;
import hsa.Console;

public class Desempeno88
{
    static Console c;           // The output console
    String[] alumnos;
    double[] notas;
    Desempeno88 ()
    {
	alumnos = new String [8];
	notas = new double [8];
    }


    void ingresoDeDatos ()
    {
	int i;
	c.println ("Ingresa los Datos");
	for (i = 0 ; i < notas.length ; i++)
	{
	    c.println ("Ingresa el nombre del alumno [" + (i + 1) + "]:");
	    alumnos [i] = c.readString ();
	    c.println ("Ingresa la nota del alumno [" + (alumnos [i]) + "]: ");
	    notas [i] = c.readDouble ();
	}

    }


    void imprimirDatos ()
    {
	int i;
	c.clear ();
	c.setCursor (1, 24);
	c.println ("Alumnos");
	c.setCursor (1, 30);
	c.println ("  Nota");
	c.setCursor (1, 38);
	c.println (" Condicion");
	for (i = 0 ; i < notas.length ; i++)
	{
	    if (notas [i] >= 8)
	    {
		c.println ("Nota del alumno [" + (i + 1) + "]: | " + alumnos [i] + " | " + notas [i] + " | " + "Muy Bueno |");
	    }
	    else if (notas[i] >= 4)
	    {
		c.println ("Nota del alumno [" + (i + 1) + "]: | " + alumnos [i] + " | " + notas [i] + " | " + "Bueno |");
	    }
	    else if (notas[i] < 4)
	    {
		c.println ("Nota del alumno [" + (i + 1) + "]: | " + alumnos [i] + " | " + notas [i] + " | " + "Insuficiente |");
	    }
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno88 e = new Desempeno88 ();
	e.ingresoDeDatos ();
	e.imprimirDatos ();
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno88 class
