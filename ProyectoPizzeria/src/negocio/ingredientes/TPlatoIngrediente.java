package negocio.ingredientes;

public class TPlatoIngrediente {
	private String nombrePlato;
	private String nombreIngrediente;
	
	public TPlatoIngrediente(String plato, String ingrediente) {
		this.nombrePlato=plato;
		this.nombreIngrediente=ingrediente;
	}
	public String getnombrePlato() {
		return this.nombrePlato;
	}
	
	public String getnombreIngrediente() {
		return this.nombreIngrediente;
	}
	
	public void setnombrePlato(String plato) {
		this.nombrePlato=plato;
	}
	
	public void setnombreIngrediente(String ingrediente) {
		this.nombreIngrediente=ingrediente;
	}
}
