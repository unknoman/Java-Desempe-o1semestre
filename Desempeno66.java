// The "Desempeno66" class.
import java.awt.*;
import hsa.Console;

public class Desempeno66
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int numero, factorial, suma, i, ii;
	factorial = 0;
	c.print("Ingresa el numero para saber la factorial");
	numero = c.readInt();
	for(i = 0; i <= numero; i++)
	{
	ii = numero - 1;
	factorial = factorial + numero * ii;
	
	
	c.println(factorial);
	
	
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno66 class
