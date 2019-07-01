package br.edu.ifpb.esperanca.daw2.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.dao.TerapiaAdjDAO;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.TerapiaAdj;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

public class TerapiaAdjService implements Serializable, Service<TerapiaAdj> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private TerapiaAdjDAO terapiaAdjDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(TerapiaAdj user) {
		terapiaAdjDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(TerapiaAdj user)  {
		terapiaAdjDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(TerapiaAdj user) {
		terapiaAdjDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public TerapiaAdj getByID(long userId)  {
			return terapiaAdjDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<TerapiaAdj> getAll() {
			return terapiaAdjDAO.getAll();
	}

}
