// The "Des73" class.
import java.awt.*;
import hsa.Console;

public class Des73
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int numero, multiplos, i;
	i = 1;
	c.println("Ingresa un numero");
	numero = c.readInt();
	
	do
	{
	multiplos = numero * i;
	i++;
	c.println("Multiplo de " + numero + " " + multiplos);
	}
	while(multiplos <= 800);
	// Place your program here.  'c' is the output console
    } // main method
} // Des73 class
