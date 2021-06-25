// The "Banco" class.
import java.awt.*;
import hsa.Console;

public class Banco
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int clientes, cuenta, i;
	double monto, suma, promedio;
	clientes = 0;
	i = 0;
	suma = 0;
	promedio = 0.0;
	c.println("Ingresa el numero de cuenta");
	cuenta = c.readInt();
       while(0 < cuenta)
       {
	c.println("Ingresa el monto a depositar");
	monto = c.readDouble();
	suma = suma + monto;
	c.println("Ingresa el numero de cuenta");
	cuenta = c.readInt();
	clientes++;
	if(monto > 2000)
	{
	i++;
	}
	promedio = suma / clientes;
       }
	c.println("Clientes procesados; "+ clientes);
	c.println("clientes con deposito superiores a los $2000 "+ i + " Clientes");
	c.println("El promedio de los depositos es $"+ promedio);
	
       }
	// Place your program here.  'c' is the output console
   } // main method} // Banco class
