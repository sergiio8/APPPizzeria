package presentacion.controlador;

import negocio.factoria.FactoriaAbstractaNegocio;
import negocio.mesas.SAMesas;
import negocio.mesas.TMesas;
import presentacion.Evento;

public class ControladorImp extends Controlador { //implementacion

	@Override
	public void accion(Evento e, Object datos) {
		switch(e) {
		case ALTA_MESA:
			TMesas tm = (TMesas) datos;
			SAMesas saMesas = FactoriaAbstractaNegocio.getInstace().crearSAMesas();
			
			int res = saMesas.alta(tm);
			
			
		}

	}

}
