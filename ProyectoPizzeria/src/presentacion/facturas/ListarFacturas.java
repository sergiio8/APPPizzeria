package presentacion.facturas;

import javax.swing.JDialog;
import javax.swing.JFrame;

import presentacion.Evento;
import presentacion.IGUI;

public class ListarFacturas extends JDialog implements IGUI{
	public ListarFacturas(JFrame parent) {
		super(parent, true);
		initGUI();

	}
	
	private void initGUI() {
		
	}

	@Override
	public void actualizar(Evento e, Object datos) {
		switch(e) {
		case LISTAR_FACTURAS_VISTA:
			setVisible(true);
			break;
		}
		
	}

}
