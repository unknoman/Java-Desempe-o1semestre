// The "Desempeno56" class.
import java.awt.*;
import hsa.Console;

public class Desempeno56
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int i, numero, numeroxd;
	c.print("Ingresa un numero para ver sus multiplos");
	numero = c.readInt();
	numeroxd = 0;
	for(i = 0; i<=30; i++)
	{
	numeroxd++;
	if(numeroxd % numero == 0)
	{
	c.println("Multiplos de " + numero + ": " + numeroxd);
	}
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno56 class
