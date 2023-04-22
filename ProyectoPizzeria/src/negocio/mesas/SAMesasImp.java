package negocio.mesas;

import java.util.Collection;

import integracion.factoria.FactoriaAbstractaIntegracion;
import integracion.mesas.DAOMesas;

public class SAMesasImp implements SAMesas{

	@Override
	public Integer alta(TMesas tm) {
		Integer id =-1;
		
		DAOMesas daoMesas = FactoriaAbstractaIntegracion.getInstace().crearDAOMesas();
		
		if(tm != null) {
			TMesas esta = daoMesas.obtenMesa(tm.getId());
			if(esta == null) {
				id = daoMesas.insertaMesa(tm);
			}
		}
		
		return id;
	}

	@Override
	public TMesas consulta(Integer id) {
		DAOMesas daoMesas = FactoriaAbstractaIntegracion.getInstace().crearDAOMesas();
		return daoMesas.obtenMesa(id);
	}

	@Override
	public Collection<TMesas> consultaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modificar(TMesas tm) {
		DAOMesas daoMesas = FactoriaAbstractaIntegracion.getInstace().crearDAOMesas();
		return daoMesas.modificaMesa(tm);
	}

	@Override
	public Boolean borrar(Integer id) {
		DAOMesas daoMesas = FactoriaAbstractaIntegracion.getInstace().crearDAOMesas();
		return daoMesas.daDeBajaMesa(id);
	}

}
