// The "Ejercicios" class.
import java.awt.*;
import hsa.Console;

public class Ejercicios
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int habitacion, desayuno, cochera, diasd, total;
	int simple = 1600;
	int doble = 2800;
	int triple = 4000;
	int cuadruple = 5200;
	int departamento = 6100;
	int dias = 500;
	int cocherad = 300;
	c.print (" Ingresar cuantas personas estaran en el hotel ");
	 habitacion = c.readInt ();
	c.print (" Ingresar cuantos dias son ");
	 diasd = c.readInt ();
	 // habitaciones start
	 switch(habitacion) // switch habitaciones 
	 {
	 // habitacion 1 
	 case 1: // caso 1 
	 c.print (" Usted eligio habitacion simple \n");
	 c.print (" Incluye desayuno? 1- si 2- no ");
	 desayuno = c.readInt();
	 switch(desayuno) 
	 {
	 case 1: 
	 c.print (" Incluye cochera? 1- si 2- no ");
	 cochera = c.readInt();
	 switch(cochera)
	 {
	 case 1:
	 total = simple + (dias * diasd) + (desayuno * diasd) + (cochera * diasd);
	 c.print ("Usted tiene que abonar $" + total);
	 case 2: 
	 total = simple + (dias * diasd) + (desayuno * diasd);
	 c.print ("Usted tiene que abonar $" + total);
	 }
	 case 2: // case 2 desayuno no incluido 
	 c.print (" Incluye cochera? 1- si 2- no ");
	 cochera = c.readInt();
	 switch(cochera)
	 {
	 case 1: 
	 total = simple + (dias * diasd) +
	 total = simple + (2);
	 c.print ("Usted tiene que abonar $" + total);
	 }
	 
	 // habitacion 2 
	 switch(desayuno)
	 {
	 case 1: 
	 }
	 habitacion = c.readInt ();
	 break;
	 // habitacion 2 
	 case 2:
	 c.print ("Usted eligio habitacion doble");
	 break;
	 case 3:
	 c.print("Usted eligio habitacion triple");
	 break;
	 case 4:
	 c.print("Usted eligio habitacion cuadruple");
	 case 5:
	 c.print("Usted eligio departamento");
	 }
	 
	 // habitaciones end 
	// Place your program here.  'c' is the output console
    } // main method
} // Ejercicios class
