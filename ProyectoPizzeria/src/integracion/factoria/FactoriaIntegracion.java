package integracion.factoria;

import integracion.facturas.DAOFactura;
import integracion.facturas.DAOFacturaImp;
import integracion.mesas.DAOMesas;
import integracion.mesas.DAOMesasImp;

public class FactoriaIntegracion extends FactoriaAbstractaIntegracion {

	@Override
	public DAOMesas crearDAOMesas() {
		// TODO Auto-generated method stub
		return new DAOMesasImp();
	}
	
	public DAOFactura crearDAOFactura() {
		return new DAOFacturaImp();
	}

}
