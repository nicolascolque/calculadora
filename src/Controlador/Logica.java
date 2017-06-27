package Controlador;

import Utils.Ayudante;
import Utils.suma;
import Utils.suma.suma;

public class Logica 
	{
		public double calcular(String valor)
		{
			String [] numeros;
			double resultado=0;
			
			if (valor.contains("\\+")) 
					{
						numeros =valor.split("+");
						if (numeros.length>1)
						{
							Utils.suma sumar= new suma ();
							
							switch (numeros.length) 
							{
							case 2:
								resultado = sumar.suma("+",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1]));
								break;
								
							case 3:
								
								resultado = sumar.suma("+",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1],Ayudante.conversor(numeros[2]));
							
							break;
							
							default:
								resultado= sumar.suma("+",Ayudante.conversor(numeros));
								break;
							}
						}
					}
			if (valor.contains("-"))
				{
					numeros =valor.split("-");
					if (numeros.length>1)
					{
						Suma restar= new Resta ();
						switch (numeros.length) 
						{
						case 2:
							resultado = restar.Resta("+",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1]))
							break;
						case 3:
							
							resultado = restar.Resta("+",Ayudante.conversor (numeros[0]),Ayudante.conversor(numeros[1],Ayudante.conversor(numeros[2]))
						break;
						
						default:
							resultado= restar.Resta("+",Ayudante.conversor(numeros));
							break;
						}
					}
				
				}
		}
		return resultado;
	}
