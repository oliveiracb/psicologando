package br.edu.ifpb.esperanca.daw2.services;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.Identificavel;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;

public interface Service<E extends Identificavel> {

	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List<E> getAll();

	

}