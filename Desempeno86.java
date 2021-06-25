// The "Desempeno86" class.
import java.awt.*;
import hsa.Console;

public class Desempeno86
{
    static Console c;       // The output console
    int[] valores;
    Desempeno86 ()
    {
	valores = new int [7];
    }


    void cargarValores ()
    {
	for (int i = 0 ; i < valores.length ; i++)
	{
	    c.println ("ingresa el valor [" + (i + 1) + "]");
	    valores [i] = c.readInt ();
	}
    }

    int operaciones1 ()
    {
	int suma2mayor;
	suma2mayor = 0;
	int resultado;
	for (int i = 0 ; i < valores.length ; i++)
	{
	    if (valores[i] > 50)
	    {
		suma2mayor = suma2mayor + valores [i];
	    }
	    
	
	}
	return suma2mayor;
    }
    

    int operaciones2 ()
    {
	int suma2, mayores;
	suma2 = mayores = 0;
	int resultado;
	for (int i = 0 ; i < valores.length ; i++)
	{
	    suma2 = suma2 + valores [i];
	}
	return suma2;
    }


    int operaciones3 ()
    {
	int mayores;
	mayores = 0;
	int guardar;
	guardar = 0;
	for (int i = 0 ; i < valores.length ; i++)
	{
	    if (valores[i] > 50)
	    {
		mayores++;
	    }
	}
	return mayores;
    }


    void imprimir ()
    {
    c.println ("La suma de los valores mayores a 50 " + operaciones1 ());
	c.println ("La suma es " + operaciones2 ());
	c.println ("veces en las que hubo un numero mayor a 50 " + operaciones3 ());
    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desempeno86 e = new Desempeno86 ();
	e.cargarValores ();
	e.imprimir ();
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno86 class
