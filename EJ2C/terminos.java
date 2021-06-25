// The "terminos" class.
import java.awt.*;
import hsa.Console;

public class terminos
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
    int n, ndd, i;
    ndd = 1;
    i = 1;
    n = 0;
	c = new Console ();
	while(i < 5)
	{
	n = n + (5 * ndd);
	c.println("es " + n);
	ndd++;
       i++;
	}
	
	// Place your program here.  'c' is the output console
    } // main method
} // terminos class
