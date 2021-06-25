// The "Desempeno54" class.
import java.awt.*;
import hsa.Console;

public class Desempeno54
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int i, numero, mayor;
	mayor = 0;
	for(i=1;i<=5;i++)
	{// for start
	c.print("Ingresa un numero");
	numero = c.readInt();
	if(numero > mayor) 
	{ // if start
	mayor = numero;
	}// if stop
	}// for stop
	c.print("El numero mayor fue " + mayor);
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno54 class
