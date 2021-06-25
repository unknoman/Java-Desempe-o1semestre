// The "Des78" class.
import java.awt.*;
import hsa.Console;

public class Des78
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int sexo, next, hombres, mujeres;
	double total, sueldo, sueldoPromedio, sueldo2, sueldoPromediom, total2, resultado;
	total = 0;
	hombres = 0;
	mujeres = 0;
	sueldoPromedio = 0;
	sueldoPromediom = 0;
	sueldo = 0;
	total2 = 0;
	do
	{
	     c.println ("Ingresa el sexo 1 para Hombres 2 para Mujeres");
	    sexo = c.readInt ();
	    switch(sexo)
	    {
	    case 1:
	    hombres++;  
	    c.println ("Ingresa el sueldo");
	    sueldo = c.readInt ();
	    sueldoPromedio = sueldoPromedio + sueldo;
	    if (sueldo < 1500)
	    {
		total = total + (sueldo * 1.15);
	    }
	    if (sueldo > 1500 && sueldo < 2500)
	    {
		total = total + (sueldo * 1.10);
	    }
	    if (sueldo > 2500)
	    {
		total = total + (sueldo * 1.5);
	    } 
	    break;
	    
	    case 2:
	    mujeres++;
	    c.println ("Ingresa el sueldo");
	    sueldo2 = c.readInt ();
	    sueldoPromediom = sueldoPromediom + sueldo2;
	    if (sueldo < 1500)
	    {
		total2 = total2 + (sueldo2 * 1.15);
	    }
	    if (sueldo2 > 1500 && sueldo2 < 2500)
	    {
		total2 = total2 + (sueldo2 * 1.10);
	    }
	    if (sueldo2 > 2500)
	    {
		total2 = total2 + (sueldo2 * 1.5);
	    } 
	    break;
	    }
	   

	    c.println ("Desea ingresar otro dato? 1 Si 2 No");
	    next = c.readInt ();
	}
	while (next == 1);
	c.println("Sueldo promedio de hombres: " + sueldoPromedio / hombres);
	c.println("Sueldo promedio de mujeres: " + sueldoPromediom / mujeres);
	resultado = total + total2;
	c.println("Total a abonar por parte de la distribuidora: $" + resultado);
	// Place your program here.  'c' is the output console
    } // main method
} // Des78 class
