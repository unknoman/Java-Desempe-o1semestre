// The "Desempeno55" class.
import java.awt.*;
import hsa.Console;

public class Desempeno55
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int i, numero;
	numero = 1;
	for(i = 1; i <= 20; i++)
	{
	c.println(numero * 5);
	numero++;
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno55 class
