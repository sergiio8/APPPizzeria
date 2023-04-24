package presentacion.clientes;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presentacion.*;
import presentacion.controlador.Controlador;

public class VistaPrincipalCliente extends JFrame implements IGUI{

	
	private Controlador controller;
	private JLabel lid;
	private JTextField tid;
	private JButton ok;
	private JLabel lcuenta;
	private JButton register;
	
	public VistaPrincipalCliente() {
		
		this.setTitle("MENÚ");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		
		JPanel lp1 = new JPanel();
		lp1.setAlignmentX(CENTER_ALIGNMENT);
		
		lid = new JLabel();
		lid.setText("Introduzca su id de usuario(NIF):");
		lp1.add(lid);
		mainPanel.add(lp1);
		
		
		JPanel tp1 = new JPanel();
		tp1.setAlignmentX(CENTER_ALIGNMENT);
		
		tid = new JTextField();
		tid.setAlignmentX(CENTER_ALIGNMENT);
		tid.setMaximumSize(new Dimension(300, 50));
		tp1.add(tid);
		
		ok = new JButton();
		ok.setText("OK");
		
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		tp1.add(ok);
		mainPanel.add(tp1);
		
		
		JPanel lp2 = new JPanel();
		lp2.setAlignmentX(CENTER_ALIGNMENT);
		
		lcuenta = new JLabel();
		lcuenta.setText("¿No está registrado? Regístrese aquí:");
		lp2.add(lcuenta);
		mainPanel.add(lp2);
		
		JPanel bp1 = new JPanel();
		bp1.setAlignmentX(CENTER_ALIGNMENT);
		
		register = new JButton();
		register.setText("Regístrate");
		register.setSize(new Dimension(300, 50));
		bp1.add(register);
		mainPanel.add(bp1);
		
		
	}
	
	
	
	
	@Override
	public void actualizar(Evento e, Object datos) {
		// TODO Auto-generated method stub
		
	}
}
