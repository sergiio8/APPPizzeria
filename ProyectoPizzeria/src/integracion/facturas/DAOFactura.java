package integracion.facturas;

import negocio.facturas.TFactura;

public interface DAOFactura {
	
	public boolean modificarFactura(TFactura f);
	public TFactura buscarFactura(String id);
	public int crearFactura(TFactura f);
	public void mostrarFacturas();
//que pasa
}
