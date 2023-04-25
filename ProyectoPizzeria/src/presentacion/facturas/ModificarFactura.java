package presentacion.facturas;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

import javax.swing.JSpinner;

import presentacion.Evento;
import presentacion.IGUI;
import presentacion.controlador.Controlador;
import presentacion.mesas.VistaAnadirMesa;

public class ModificarFactura extends JDialog implements IGUI{
	
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JSpinner cantidad;
	
	public ModificarFactura(JFrame parent) {
		super(parent, true);
		initGUI();
	}
	
	private void initGUI() {
		setTitle("Modificar facturas");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		setContentPane(mainPanel);

		JPanel panel1 = new JPanel(new FlowLayout());
		JLabel ID_factura = new JLabel("ID_factura: ");
		text1 = new JTextField();
		
		panel1.add(ID_factura);
		panel1.add(text1);
		
		mainPanel.add(panel1, BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel(new FlowLayout());
		JLabel ID_Lineafact = new JLabel("ID_linea_factura: ");
		text2 = new JTextField();
		
		panel2.add(ID_Lineafact);
		panel2.add(text2);
		
		mainPanel.add(panel2, BorderLayout.CENTER);
	
		
		JPanel panel3 = new JPanel(new FlowLayout());
		JLabel ID_producto = new JLabel("ID_producto: ");
		text3 = new JTextField();
		
		panel3.add(ID_producto);
		panel3.add(text3);
		
		mainPanel.add(panel3, BorderLayout.CENTER);
	
		
		JPanel panel4 = new JPanel(new FlowLayout());
		JLabel cant = new JLabel("Cantidad: ");
		cantidad = new JSpinner();
		cantidad.setPreferredSize(new Dimension(50, 5));
		cantidad.setMinimumSize(new Dimension(60, 7));
		cantidad.setMaximumSize(new Dimension(60, 7));
		
		panel4.add(cant);
		panel4.add(cantidad);
		
		mainPanel.add(panel4, BorderLayout.CENTER);
	
		
		JPanel panel5 = new JPanel(new FlowLayout());
		
		
		JButton modificar = new JButton("Modificar");
		modificar.addActionListener((e) -> modificar());
		JButton cancelar = new JButton("Cancelar");
	    cancelar.addActionListener((e) -> cancelar());
	    panel5.add(modificar);
	    panel5.add(cancelar);
		
		mainPanel.add(panel5, BorderLayout.CENTER);

	}
	
	private void modificar() {
		try {
			String ID_Factura = text1.getText();
			String ID_Linea = text2.getText();
			String ID_Producto = text3.getText();
			int Cantidad = Integer.parseInt(cantidad.getValue().toString());
			
			if (Cantidad <= 0) {
				throw new NumberFormatException();
			}
			
			Controlador.getInstance().accion(Evento.MODIFICAR_FACTURA, new TLineaFactura(ID_Linea, ID_Factura, ID_Producto, Cantidad));
		}
		catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(ModificarFactura.this, "ERROR: la cantidad debe ser un entero positivo", "ERROR: la cantidad debe ser un entero positivo", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		
	}
	
	private void cancelar() {
		setVisible(false);
		
	}

	@Override
	public void actualizar(Evento e, Object datos) {
		switch(e) {
		case MODIFICAR_FACTURA_VISTA:
			setVisible(true);
			break;
		case MODIFICAR_FACTURA_VISTA_OK:
			JOptionPane.showMessageDialog(this,"Factura con ID " + datos.toString() + " modificada correctamente" ,"Factura con ID " + datos.toString() + " modificada correctamente", JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			initGUI();
			break;
		case MODIFICAR_FACTURA_VISTA_WR:
			JOptionPane.showMessageDialog(this, "ERROR: " + datos.toString(), "ERROR: " + datos.toString(), JOptionPane.ERROR_MESSAGE);
			setVisible(false);
			break;
		}
		
	}

}
