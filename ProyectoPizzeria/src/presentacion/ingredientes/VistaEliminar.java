package presentacion.ingredientes;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;

import presentacion.controlador.Controlador;

public class VistaEliminar extends JDialog{
	private Controlador ctrl;
	
	VistaEliminar(Controlador ctrl){
		this.ctrl = ctrl;
		initGUI();
	}
	private void initGUI() {
		setTitle("Eliminar ingrediente");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		setContentPane(mainPanel);
		
		//combobox para eliminar con 2 botones de ok y cancel para confirmar la accion, es trivial pq es igual q el force laws dialog
		
		pack();
		setResizable(false);
		setVisible(true);
	}
}
