package presentacion.clientes;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import presentacion.Evento;
import presentacion.IGUI;

public class VistaClienteLogueado extends JDialog implements IGUI{
	
	
	private JButton modificarDatos;
	private JButton realizarReserva;
	
	public VistaClienteLogueado(Frame parent) {
		super(parent ,true);
		
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		JPanel mPanel = new JPanel();
		mPanel.setAlignmentX(CENTER_ALIGNMENT);
		
		modificarDatos = new JButton();
		modificarDatos.setText("Modifica tus datos");
		modificarDatos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		mPanel.add(modificarDatos);
		mainPanel.add(mPanel);
		
		
		JPanel rPanel = new JPanel();
		rPanel.setAlignmentX(CENTER_ALIGNMENT);
		
		realizarReserva = new JButton();
		realizarReserva.setText("Realizar una reserva");
		realizarReserva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		rPanel.add(realizarReserva);
		mainPanel.add(rPanel);
		
		pack();
		setResizable(false);
	}
	
	
	@Override
	public void actualizar(Evento e, Object datos) {
		// TODO Auto-generated method stub
		
		switch(e) {
		case CLIENTE_LOGUEADO:
			this.setVisible(true);
			this.setTitle("Pantalla del cliente: " + (String)datos);
		}
		
	}
}
