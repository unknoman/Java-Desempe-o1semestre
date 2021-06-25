// The "Des75" class.
import java.awt.*;
import hsa.Console;

public class Des75
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	int random, intentos, numero, intentos2;
	intentos2 = 0;
	c = new Console ();
	intentos = 0;
	random = 1 +(int)(Math.random() * 15);
	do
	{
	 c.println(" Numero es " + random );
	 numero = c.readInt();
	 
	 if(numero == random)
	 {
	 intentos = 1;
	  c.println("Ganaste! " +intentos + " Intentos");
	 } else 
	 {
	 intentos2++;
	 }
	if(intentos2 == 7)
	{
	c.println("Perdiste el numero era: " + random + "");
       intentos = 1;
	}
	}
	while (intentos <= 1);


	    // Place your program here.  'c' is the output console
    } // main method
} // Des75 class
