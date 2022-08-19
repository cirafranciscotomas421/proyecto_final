package DISP_ELEC;
import javax.swing.JOptionPane;


public abstract class Plantilla {
	/**
	 * Atributos
	 */
	protected int precio, comprar;//variables tipo global se usa en todo nuestras clases
	protected String marca;
	protected String guardar;
	private static int precio_estab = 0;// tipo local solo en una sola clase 
	
	public void Operaciones() {
		int opcion = 0;
		int bandera = 0;
		do {
			do {
				opcion = Integer.parseInt(JOptionPane
							.showInputDialog("Porfavor seleccione la opcion que desea comprar:" + "\n" + "[1].-Celular" + "\n"
										+ "[2].-Laptod " + "\n" + "[3].-Televisión" + "\n" + "[4].-Salir"

								));
						if (opcion >= 1 && opcion <= 4) {
							bandera = 1;
						} else {
							JOptionPane.showMessageDialog(null, "Opcion no encontrada");
						}
					} while (bandera == 0); //para que vuelva a retonar
			/**
			 * switch para determinar la opcion que desea el cliente				
			 */
					switch (opcion) { //se crea las opciones
					case 1: //consultar 
						Plantilla creando_consulta= new Celular();
						creando_consulta.Precio();//sobreestructura de metodos  //Datos cambiar
						break;
						
					case 2: 
						Plantilla mar= new Laptod();
						mar.Precio();
						break;
						
					case 3://depositos
						Plantilla guarda= new Television();
						guarda.Precio();
						break;
			
						
					case 4://salir
						JOptionPane.showMessageDialog(null, "Vuelva pronto");
						bandera=2;
						break;

					}

				} while (bandera != 2);
			}

	

	public void Precios() {
	precio = Integer.parseInt(JOptionPane.showInputDialog(null,"MARCA:"));
	
	}
	

	public void compras () {
	comprar= Integer.parseInt(JOptionPane.showInputDialog(null,"desea comprar"));
	
	
	}
	public void guardado() {
	guardar= JOptionPane.showInputDialog(null,"guardado");
	}

	
	public abstract void Precio();//es de tipo asbstract sig que se va sobreescribir

	public static int getPrecio_estab() {
	return precio_estab;
	}

	public static void setPrecio_estab(int precio_estab) {
	Plantilla.precio_estab =precio_estab;

	}}

	
	
