// The "Ejemplo27" class.
import java.awt.*;
import hsa.Console;

public class Ejemplo27
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int n, suma, i, mayor, numero;
	suma = mayor = 0;
	c.print("Ingresa el numero de ventas realizadas ");
	n = c.readInt();
	
	for(i=1; i <= n; i++)
	{
	c.print("Ingresa el precio de ventas " );
	numero = c.readInt();
	if(numero > 1000)
	{// start else
	 mayor++;
	 suma = suma + numero;
	} // fin else
	} // fin for 
	c.print(mayor + " Ventas Mayores a 1000" ); 
	c.println();
	 c.print("$" + suma + " Suma total de las ventas mayores a 1000 " );
	
	// Place your program here.  'c' is the output console
    } // main method
} // Ejemplo27 class
