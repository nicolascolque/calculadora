package Controlador;

import Utils.Ayudante;
import Utils.Division;
import Utils.Multiplicacion;
import Utils.Resta;
import Utils.Suma;


public class Logica 
	{
		public double calcular(String valor)
		{
			String [] numeros;
			double resultado=0;
			
			if (valor.contains("+")) 
					{
						numeros =valor.split("\\+");
						
						if (numeros.length>1)
				
						{
							Suma sumar= new Suma();
							
							switch (numeros.length) 
							{
							case 2:
								resultado = sumar.suma("+",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1]));
								break;
								
							case 3:
								
								resultado = sumar.suma("+",Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]),Ayudante.conversor(numeros[2]));
							
							break;
							
							default:
								resultado= sumar.suma("+",Ayudante.conversor(numeros));
								break;
							}
						}
							return resultado;
					}
		
			if (valor.contains("-"))
				{
					numeros = valor.split("-");
					
					if (numeros.length>1)
					{
						Resta restar= new Resta();
						switch (numeros.length) 
						{
						case 2:
							resultado = restar.resta("-",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1]));
							break;
						case 3:
							resultado = restar.resta("-",Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]), Ayudante.conversor(numeros[2]));
						break;
						
						default:
							resultado= restar.resta("-",Ayudante.conversor(numeros));
							break;
						}
					}
					return resultado;
				}
			
			
		
		if (valor.contains("*"))
		{
			numeros = valor.split("\\*");
			
			if (numeros.length>1)
			{
				Multiplicacion multiplicar= new Multiplicacion();
				switch (numeros.length) 
				
				{
				case 2:
					resultado = multiplicar.multiplicacion("*",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1]));
					break;
				case 3:
					resultado = multiplicar.multiplicacion("*",Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]), Ayudante.conversor(numeros[2]));
				break;
				
				default:
					resultado= multiplicar.multiplicacion("*",Ayudante.conversor(numeros));
					break;
				}
			}
		return resultado;
		}
	  
	
		if (valor.contains("/"))
		{
			numeros = valor.split("\\/");
			
			if (numeros.length>1)
			{
				Division dividir = new Division();
				switch (numeros.length) 
				
				{
				case 2:
					resultado = dividir.division("/",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1]));
					break;
				case 3:
					resultado = dividir.division("/",Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]), Ayudante.conversor(numeros[2]));
				break;
				
				default:
					resultado= dividir.division("/",Ayudante.conversor(numeros));
					break;
				}
			}
		
		}
	  return resultado;
	}
}
