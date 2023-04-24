package presentacion.producto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presentacion.Evento;
import presentacion.IGUI;

public class AnadirPlatoVista extends JDialog implements IGUI{
	
	private static final long serialVersionUID = 1L;

	public AnadirPlatoVista(Frame parent) {
		super(parent, true);
		initGUI();
	}
	
	private void initGUI() {
		setTitle("Anadir plato");
		setLayout(new BorderLayout());
		
		//ID
		JPanel panel1 = new JPanel(new FlowLayout());
		JLabel ID = new JLabel("ID_plato: ");
		JTextField textID = new JTextField();
		
		panel1.add(ID);
		panel1.add(textID);
		
		add(panel1, BorderLayout.CENTER);
		
		//Nombre
		JPanel panel2 = new JPanel(new FlowLayout());
		JLabel cantidad = new JLabel("Nombre: ");
		JTextField textCantidad = new JTextField();
		
		panel2.add(cantidad);
		panel2.add(textCantidad);
		
		add(panel2, BorderLayout.CENTER);
		
		//Precio
		JPanel panel3 = new JPanel(new FlowLayout());
		JLabel precio = new JLabel("Precio: ");
		JTextField textPrecio = new JTextField();
		
		panel3.add(precio);
		panel3.add(textPrecio);
		
		add(panel3, BorderLayout.CENTER);
		
		//Ingredientes
		JPanel panel4 = new JPanel(new FlowLayout());
		JLabel ingredientes = new JLabel("Ingredientes: ");
		JTextField textIngredientes = new JTextField();
		
		panel4.add(ingredientes);
		panel4.add(textIngredientes);
		
		add(panel4, BorderLayout.CENTER);

		//Descripcion
		JPanel panel5 = new JPanel(new FlowLayout());
		JLabel descripcion = new JLabel("Descripcion: ");
		JTextField textDescripcion = new JTextField();
		
		panel5.add(descripcion);
		panel5.add(textDescripcion);
		
		add(panel5, BorderLayout.CENTER);
		
		//Stock??
		
		JPanel endPanel = new JPanel(new FlowLayout());
		
		JButton anadir = new JButton("Anadir");
		anadir.addActionListener((e) -> anadir());
		JButton cancelar = new JButton("Cancelar");
	    cancelar.addActionListener((e) -> cancelar());
	    endPanel.add(anadir);
	    endPanel.add(cancelar);
		
		add(panel3, BorderLayout.CENTER);
	}
	
	private void anadir() {
		
		
	}
	
	private void cancelar() {
		
	}

	@Override
	public void actualizar(Evento e, Object datos) {
		// TODO Auto-generated method stub
		
	}

}
