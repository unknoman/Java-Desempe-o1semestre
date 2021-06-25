// The "Desempeno84" class.
import java.awt.*;
import hsa.Console;

public class Desempeno84
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	c = new Console ();
	int f, suma, resultado, promedio;
	suma = 0;
	for (f = 0 ; f < vector.length ; f++)
	{
	    if (vector [f] < vector [10])
	    {
		suma = suma + vector [f];
	    }
	}
	promedio = suma / 10;
c.println("El promedio de los primeros 10 elementos es : " + promedio);
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno84 class


