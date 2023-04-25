package integracion.facturas;

import negocio.facturas.TFactura;
import negocio.facturas.TLineaFactura;

public interface DAOFactura {
	
	public boolean modificarFactura(TLineaFactura linea);
	public TFactura buscarFactura(String id);
	public int crearFactura(TFactura f);
	public void mostrarFacturas();
//que pasa
}
