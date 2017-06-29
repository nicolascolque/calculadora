import Controlador.Logica;
import Vista.Pantallas;

public class Application 
	{
	 public static void main(String[] args)
	 	{
		 Pantallas Vista = new Pantallas ();
		 Logica controlador = new Logica();
		 
		 String valorIngresado = Vista.ingresarValor("Calculadora");
		 Vista.mostrarMensaje("El resultado es: " +controlador.calcular(valorIngresado));
		 
		 
	 	}
	}
