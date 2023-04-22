package negocio.clientes;

public class TCliente {
	
	private String id;
	private String contra;
	private String nombre;
	private String apellido;
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setContra(String contra) {
		this.contra = contra;
	}
	
	public String getContra() {
		return this.contra;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
}
