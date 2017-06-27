package Vista;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantallas {
	
 public String ingresarValor(String Titulo)
	 {
		 JFrame frame= new JFrame();
		 
		 String valorIngresado;
		 
		 valorIngresado = JOptionPane.showInputDialog(frame, Titulo, "");
		 
		 return valorIngresado;
		 
		 	 
	 }
 
public void mostrarMensaje(String mensaje)
	  {
		  JFrame frame = new JFrame();
		  JOptionPane.showMessageDialog(frame, mensaje);
	  }
  

}
