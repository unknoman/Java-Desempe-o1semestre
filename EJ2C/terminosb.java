// The "terminosb" class.
import java.awt.*;
import hsa.Console;

public class terminosb
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
    // no me cost'o pero lo guardo por las dudas
	c = new Console ();
	int a, b, i;
	i = 1;
	a = 500;
	while(i < 15)
	{
	a = a + 25;
	c.println("es " +a);
	i++;
	}
	// Place your program here.  'c' is the output console
    } // main method
} // terminosb class
