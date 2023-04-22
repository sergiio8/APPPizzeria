package integracion.mesas;

import negocio.mesas.TMesas;

public interface DAOMesas {
	
	public Integer insertaMesa(TMesas tm);
	public Boolean daDeBajaMesa(Integer id);
	public TMesas obtenMesa(Integer id);
	Boolean modificaMesa(TMesas tm);
}
