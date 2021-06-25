// The "Ejercicio23" class.
import java.awt.*;
import hsa.Console;

public class Ejercicio23
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	float suma, altura;
	int i;
	suma = 0;      
	for(i = 1; i <=2; i++)
	{
	 c.print("Ingresa la altura de 8 personas");
	 altura = c.readFloat();
	 suma = suma + altura;
	 }
	 suma = suma / 8;
	 c.print("el promedio de altura de las 8 personas es: " + suma);
	// Place your program here.  'c' is the output console
    } // main method
} // Ejercicio23 class
