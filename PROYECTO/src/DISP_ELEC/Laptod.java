package DISP_ELEC;

import javax.swing.JOptionPane;

public class Laptod extends Plantilla {
	public void Precio(){
		 int Laptod=5000;
		precio=getPrecio_estab();
		setPrecio_estab(Laptod );
		JOptionPane.showMessageDialog(null,"Laptod marca HP precio $"+getPrecio_estab()+".00");
		
		//patalla.mensaje,solo getpantalla
	}



		
	}
