package negocio.facturas;

import java.util.ArrayList;

public class TDatosVenta {
	private ArrayList<TLineaFactura> productos;
	private String id_cliente;
	
	public TDatosVenta(ArrayList<TLineaFactura> productos, String Id_cliente) {
	    this.productos = productos;
		id_cliente = Id_cliente;
	}
	
	public ArrayList<TLineaFactura>  getProductos(){
		return productos;
	}
	
	
	public String getid_cliente() {
		return id_cliente;
	}
	
	public void setProductos(ArrayList<TLineaFactura> prod) {
		this.productos = prod;
	}
	
	public void setId_cliente(String Id_cliente) {
		id_cliente = Id_cliente;
	}
	

}
