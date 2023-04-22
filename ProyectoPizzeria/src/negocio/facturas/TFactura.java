package negocio.facturas;

import java.util.ArrayList;

public class TFactura {
	private String id;
	private TDatosVenta datos;
	private double precio_total;
	private String fecha;
	private boolean activo;
	
	public TFactura(String Id, double total, TDatosVenta datos, String Fecha, boolean Activo) {
		id = Id;
		precio_total = total;
		this.datos = datos;
		fecha = Fecha;
		activo = Activo;
	}
	
	public String getId() {
		return id;
		
	}
	
	public String getIdCliente() {
		return datos.getid_cliente();
	}
	
	public String getIdVendedor() {
		return datos.getid_vendedor();
	}
	
	public double getPrecio_total() {
		return precio_total;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public boolean getActivo() {
		return activo;
	}
	
	public ArrayList<TLineaFactura> getProductos(){
		return datos.getProductos();
	}
	
	public void setId(String Id) {
		id = Id;
	}
	
	public void setIdCliente(String IdCliente) {
		datos.setId_cliente(IdCliente);
	}
	
	public void setIdVendedor(String IdVendedor) {
		datos.setId_vendedor(IdVendedor);
	}
	
	public void setPrecio_total(double Precio_total) {
		precio_total = Precio_total;
		
	}
	
	public void getFecha(String Fecha) {
		fecha = Fecha;
	}
	
	public void setActivo(boolean Activo) {
		activo = Activo;
	}
	
	public void setProductos(ArrayList<TLineaFactura> new_productos){
		datos.setProductos(new_productos);
	}
	
	
	
	
	

}
