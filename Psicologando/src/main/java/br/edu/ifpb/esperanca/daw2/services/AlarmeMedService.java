package br.edu.ifpb.esperanca.daw2.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.dao.AlarmeMedDAO;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

public class AlarmeMedService implements Serializable, Service<AlarmeMed> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private AlarmeMedDAO alarmeMedDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(AlarmeMed user) {
		alarmeMedDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(AlarmeMed user)  {
		alarmeMedDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(AlarmeMed user) {
		alarmeMedDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public AlarmeMed getByID(long userId)  {
			return alarmeMedDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<AlarmeMed> getAll() {
			return alarmeMedDAO.getAll();
	}

}
