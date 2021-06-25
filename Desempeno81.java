// The "Desempeno81" class.
import java.awt.*;
import hsa.Console;

public class Desempeno81
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	 int[] vector1;
	vector1 = new int [5];
	int[] vector2;
	vector2 = new int [5];
	int f, suma1, suma2;
	suma1 = suma2 = 0; 
	for(f =0;f<vector1.length;f++)
	{
	c.println("Ingresa un numero del primer vector");
	vector1[f] = c.readInt();
	suma1 = suma1 + vector1[f];
	}
	c.println("Segundo vector");
	for(f =0;f<vector2.length;f++)
	{
	c.println("Ingresa un numero del primer vector");
	vector2[f] = c.readInt();
	suma2 = suma2 + vector2[f];
	}
	 if(suma1 > suma2)
	 {
	 c.println("El primer vector es mayor que el segundo");
	 } else
	 {
	 c.println("el segundo vector es mayor que el primero");
	 }
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno81 class

