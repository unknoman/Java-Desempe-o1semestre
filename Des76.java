// The "Des76" class.
import java.awt.*;
import hsa.Console;

public class Des76
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	String candidatos, candidatomenor;
	int votos, continuar, bandera, menor, votosmenor;
	bandera = 0;
	continuar = 0;
	votos = 0;
	votosmenor = 0;
	candidatomenor = " ";
	c = new Console ();
	do
	{
	    c.println ("Ingresa un candidato");
	    candidatos = c.readLine ();
	    c.println ("Ingresa la cantidad de votos");
	    votos = c.readInt ();
	    if (bandera == 0)
	    {
		bandera++;
		candidatomenor = candidatos;
		votosmenor = votos;
	    }
	    
	    if(votos > votosmenor)
	    {
	    candidatomenor = candidatos;
	    votosmenor = votos;
	    }
	    c.println ("Desea Ingresar otro candidato? 1- SI 2- NO ");
	    continuar = c.readInt ();
	}
	while (continuar < 2);
	c.println ("El candidato ganador es " + candidatomenor + " con " + votosmenor + " votos");
	// Place your program here.  'c' is the output console
    } // main method
} // Des76 class
