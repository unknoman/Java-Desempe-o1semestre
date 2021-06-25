// The "Des77" class.
import java.awt.*;
import hsa.Console;

public class Des77
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int tipo;
	double precio, resultado, continuar;
	resultado = 0;
	do
	{
	    c.println ("Ingresa el precio del producto");
	    precio = c.readInt ();
	    c.println ("Ingresa que tipo de producto es 1- color rojo 2- etiqueta amarilla 3- etiqueta verde");
	    tipo = c.readInt ();
	    if (tipo == 1)
	    {
		resultado = resultado + (precio * 0.85);
	    }
	    
	    if (tipo == 2)
	    {
		resultado = resultado + (precio * 0.90);
	    }
	    
	     if (tipo == 3)
	    {
		resultado = resultado + (precio * 0.95);
	    }
	    
	    
	    c.println ("Continuar? 1 Para Si 2 No");
	    continuar = c.readInt ();
	}
	while (continuar < 2);
	c.println("a pagar con sus descuentos " + resultado);
	// Place your program here.  'c' is the output console
    } // main method
} // Des77 class
