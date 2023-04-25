package presentacion.facturas;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import presentacion.Evento;
import presentacion.IGUI;

public class ListarFacturas extends JDialog implements IGUI{
	public ListarFacturas(JFrame parent) {
		super(parent, true);
		initGUI();

	}
	
	private void initGUI() {
		setTitle("Listar facturas");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		setContentPane(mainPanel);
		//hacer un jtable
		
		
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
