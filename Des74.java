// The "Des74" class.
import java.awt.*;
import hsa.Console;

public class Des74
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int numero, i, pares, impares;
	i = pares = impares = 0;
	do
	{
	c.clear ();
	c.setCursor (3, 15);
	c.println("Ingresa un numero entero");
	c.setCursor (4, 22);
	numero = c.readInt();
	if(numero % 2 == 0)
	{
	pares++;
	} else
	{
	impares++;
	}
	
	i++;
	}
	while(i < 10);
	c.println("Numeros pares" + pares);
	 c.println("Numeros impares" + impares);
	// Place your program here.  'c' is the output console
    } // main method
} // Des74 class
