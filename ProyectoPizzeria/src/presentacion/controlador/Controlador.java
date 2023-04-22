package presentacion.controlador;

import presentacion.Evento;

public abstract class Controlador { //singleton
	
	private static Controlador instancia = null;
	
	public static Controlador getInstance() { //creacion perezosa, public provisional
		if(instancia == null) {
			instancia = new ControladorImp();
		}
		return instancia;
	}
	
	public abstract void accion(Evento e, Object datos); //modelo vista controlador PASIVO
	
	
	
}
