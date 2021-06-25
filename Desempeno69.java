// The "Desempeno69" class.
import java.awt.*;
import hsa.Console;

public class Desempeno69
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int numero, numero2, i, par;
	par = 0;
	c.println("Ingrese un numero");
	numero = c.readInt();
       c.println("Ingrese otro");
	numero2 = c.readInt();
	for(i = numero; i <= numero2; i++)
	{
	if(i % 2 == 0)
	{
	par++;
	}
	}
	c.println("hay "+ par + "Numeros pares entre" + numero + " y" + numero2);
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno69 class
