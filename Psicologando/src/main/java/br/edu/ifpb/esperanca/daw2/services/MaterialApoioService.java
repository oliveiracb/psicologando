package br.edu.ifpb.esperanca.daw2.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.dao.AlarmeMedDAO;
import br.edu.ifpb.esperanca.daw2.dao.MaterialApoioDAO;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;


public class MaterialApoioService implements Serializable, Service<MaterialApoio> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private MaterialApoioDAO materialApoioDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(MaterialApoio user) {
		materialApoioDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(MaterialApoio user)  {
		materialApoioDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(MaterialApoio user) {
		materialApoioDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public MaterialApoio getByID(long userId)  {
			return materialApoioDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<MaterialApoio> getAll() {
			return materialApoioDAO.getAll();
	}

}
