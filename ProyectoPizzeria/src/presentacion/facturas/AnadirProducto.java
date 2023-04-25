package presentacion.facturas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.facturas.TLineaFactura;

import javax.swing.JSpinner;

import presentacion.Evento;
import presentacion.IGUI;
import presentacion.controlador.Controlador;

public class AnadirProducto extends JDialog implements IGUI{
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JSpinner cant;
	

	private static final long serialVersionUID = 1L;

	public AnadirProducto(Frame parent) {
		super(parent, true);
		initGUI();
	}
	
	private void initGUI() {
		setTitle("Añadir producto a factura");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		setContentPane(mainPanel);
		
		JPanel panel1 = new JPanel(new FlowLayout());
		JLabel ID_factura = new JLabel("ID_factura: ");
		text1 = new JTextField();
		
		panel1.add(ID_factura);
		panel1.add(text1);
		
		mainPanel.add(panel1, BorderLayout.CENTER);
		
		JPanel panel5 = new JPanel(new FlowLayout());
		JLabel ID_linea = new JLabel("ID_linea_factura: ");
		text3 = new JTextField();
		
		panel5.add(ID_linea);
		panel5.add(text3);
		
		mainPanel.add(panel5, BorderLayout.CENTER);
		
		
		JPanel panel2 = new JPanel(new FlowLayout());
		JLabel ID = new JLabel("ID_producto: ");
		text2 = new JTextField();
		
		panel2.add(ID);
		panel2.add(text2);
		
		mainPanel.add(panel2, BorderLayout.CENTER);
		
		
		JPanel panel3 = new JPanel(new FlowLayout());
		JLabel cantidad = new JLabel("Cantidad: ");
		cant = new JSpinner();
		cantidad.setPreferredSize(new Dimension(50, 5));
		cantidad.setMinimumSize(new Dimension(60, 7));
		cantidad.setMaximumSize(new Dimension(60, 7));
		
		panel3.add(cantidad);
		panel3.add(cant);
		
		mainPanel.add(panel3, BorderLayout.CENTER);
		
		JPanel panel4 = new JPanel(new FlowLayout());
		
		

		JButton anadir = new JButton("Añadir");
		anadir.addActionListener((e) -> anadir());
		JButton cancelar = new JButton("Cancelar");
	    cancelar.addActionListener((e) -> cancelar());
	    panel4.add(anadir);
	    panel4.add(cancelar);
		
		mainPanel.add(panel4, BorderLayout.CENTER);
	}
	
	private void anadir() {
		String ID_factura;
		String ID_linea;
		String ID_producto;
		int cantidad;
		try {
			ID_factura = text1.getText();
			ID_producto = text2.getText();
			ID_linea = text3.getText();
			cantidad = Integer.parseInt(cant.getValue().toString());
			if (ID_factura == null || ID_producto == null || ID_linea == null) {
				throw new IllegalArgumentException();
			}
			else if (cantidad <= 0) {
				throw new NumberFormatException();
			}
			
			Controlador.getInstance().accion(Evento.ANADIR_PRODUCTO, new TLineaFactura(ID_linea, ID_factura, ID_producto, cantidad));
		}
		catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(AnadirProducto.this, "ERROR: la cantidad debe ser un entero positivo", "ERROR: la cantidad debe ser un entero positivo", JOptionPane.ERROR_MESSAGE);
		}
		catch(IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(AnadirProducto.this, "ERROR: relllene todos los campos relativos a los IDs", "ERROR: relllene todos los campos relativos a los IDs", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void cancelar() {
		setVisible(false);
		
	}

	@Override
	public void actualizar(Evento e, Object datos) {
		switch(e) {
		case ANADIR_PRODUCTO_VISTA:
			setVisible(true);
			break;
		case ANADIR_PRODUCTO_VISTA_OK:
			JOptionPane.showMessageDialog(this,"Producto anadido correctamente con ID: " + datos.toString() ,"Producto anadido correctamente con ID: " + datos.toString(), JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			initGUI();
			break;
		case ANADIR_PRODUCTO_VISTA_WR:
			JOptionPane.showMessageDialog(this, "ERROR: " + datos.toString(), "ERROR: " + datos.toString(), JOptionPane.ERROR_MESSAGE);
			setVisible(false);
			break;
		}
		
	}

}
