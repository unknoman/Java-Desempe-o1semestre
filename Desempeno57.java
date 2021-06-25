// The "Desempeno57" class.
import java.awt.*;
import hsa.Console;

public class Desempeno57
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int triangulos, lado1, lado2, lado3, i, trianguloigual, isoceles, escaleno, suma1, suma2, suma3;
	trianguloigual = isoceles = escaleno = 0;
	c.print("Ingresa la cantidad de triangulos ");
	triangulos = c.readInt();
	suma1 = suma2 = suma3 =0;
	for(i = 1; i <= triangulos; i++)
	{
	c.println("Ingresa el lado primer lado ");
	lado1 = c.readInt();
	c.println("Ingresa el segundo lado ");
	lado2 = c.readInt();
	c.println("ingresa el tercer lado ");
	lado3 = c.readInt();
	
	if (lado1 == lado2 && lado1 == lado3)
	{
	trianguloigual++;
	suma1++;
	//++++
	}
	if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
	{
	escaleno++;
	suma2++;
	}
	if (lado1 == lado2 && lado2 != lado3)
	{
	isoceles++;
	suma3++;
	
	}
	}
	
	if(suma1 < suma2 && suma1 < suma3)
	{
	c.println("Hubo menor cantidad de los triangulos iguales");
	}
		if(suma2 < suma1 && suma2 < suma3)
	{
	c.println("Hubo menor cantidad de los triangulos escalenos");
	}
	
			if(suma3 < suma1 && suma3 < suma2)
	{
	c.println("Hubo menor cantidad de los triangulos isoceles");
	}
	
	c.println("Cantidad de triangulos iguales " + trianguloigual);
	c.println("Cantidad de triangulos escaleno " + escaleno);
	c.println("Cantidad de triangulos isoceles " + isoceles);
	// Place your program here.  'c' is the output console
    } // main method
} // Desempeno57 class
