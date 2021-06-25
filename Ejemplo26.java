// The "Ejemplo26" class.
import java.awt.*;
import hsa.Console;

public class Ejemplo26
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int i;
	for(i = 100; i <= 200; i++)
	{
	 if(i % 6 == 0)
	 {
	 c.print(i + "");
	 }
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Ejemplo26 class
