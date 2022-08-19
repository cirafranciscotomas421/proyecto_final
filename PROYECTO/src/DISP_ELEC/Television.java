package DISP_ELEC;

import javax.swing.JOptionPane;

public class Television extends Plantilla {
	public void Precio() {
		int Television=4500;
		precio=getPrecio_estab();
		setPrecio_estab(Television);
		
		JOptionPane.showMessageDialog(null,"precio$"+getPrecio_estab()+".00");
		
	}



		
	
		
	}

	 


