package negocio.factoria;

import negocio.mesas.SAMesas;
import negocio.mesas.SAMesasImp;

public class FactoriaNegocio extends FactoriaAbstractaNegocio {

	@Override
	public SAMesas crearSAMesas() {
		
		return new SAMesasImp();
	}

}
