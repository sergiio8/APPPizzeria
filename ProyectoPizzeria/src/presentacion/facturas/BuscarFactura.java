package presentacion.facturas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.facturas.TDatosVenta;
import negocio.facturas.TLineaFactura;
import presentacion.Evento;
import presentacion.IGUI;
import presentacion.controlador.Controlador;

public class BuscarFactura extends JDialog implements IGUI{
	JTextField text1;
	public BuscarFactura(JFrame parent) {
		super(parent, true);
		initGUI();
	}
	
	private void initGUI() {
		setTitle("Buscar factura");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		setContentPane(mainPanel);
		
		JPanel panel1 = new JPanel(new FlowLayout());
		JLabel ID = new JLabel("ID_factura: ");
		text1 = new JTextField();
		
		panel1.add(ID);
		panel1.add(text1);
		
		mainPanel.add(panel1, BorderLayout.CENTER);
	
		
		JPanel panel3 = new JPanel(new FlowLayout());
		
		
		JButton buscar = new JButton("Buscar");
		buscar.addActionListener((e) -> buscar());
		JButton cancelar = new JButton("Cancelar");
	    cancelar.addActionListener((e) -> cancelar());
	    panel3.add(buscar);
	    panel3.add(cancelar);
		
		mainPanel.add(panel3, BorderLayout.CENTER);
	}
	
	private void buscar() {
		String ID_factura = null;
		try {
			ID_factura = text1.getText();
			if (ID_factura == null) {
				throw new IllegalArgumentException();
			}
			Controlador.getInstance().accion(Evento.BUSCAR_FACTURA, ID_factura);
		}
		catch(IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(BuscarFactura.this, "ERROR: rellene el campo indicando el ID de la factura", "ERROR: rellene el campo indicando el ID de la factura", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	private void cancelar() {
		setVisible(false);
		
	}

	@Override
	public void actualizar(Evento e, Object datos) {
		switch(e) {
		case BUSCAR_FACTURA_VISTA:
			setVisible(true);
			break;
		case BUSCAR_FACTURA_VISTA_OK:
			JOptionPane.showMessageDialog(this,"Factura con ID: " + datos.toString() + " encontrada con exito" ,"Factura con ID: " + datos.toString() + " encontrada con exito" , JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			
			break;
		case BUSCAR_FACTURA_VISTA_WR:
			JOptionPane.showMessageDialog(this, "ERROR: " + datos.toString(), "ERROR: " + datos.toString(), JOptionPane.ERROR_MESSAGE);
			setVisible(false);
			break;
		}
		
	}
	

}
