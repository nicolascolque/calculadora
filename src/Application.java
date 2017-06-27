import Controlador.Logica;
import Vista.Pantallas;

public class Application 
	{
	 public static void main(String[] args)
	 	{
		 Pantalla Vista = new Pantallas ();
		 Logica controlador = new Logica();
		 
		 String valoringresado= Vista.ingresarvalor("Calculadora");
		 Vista.mostrarMensaje("El resultado es: " + controlador.calcular(valoringresado));
		 
		 
	 	}
	}
