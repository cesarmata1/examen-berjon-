package es.upsa.dasi.examen.backend.application.impl;
import es.upsa.dasi.examen.backend.adapters.output.persistence.Dao;
import es.upsa.dasi.examen.backend.application.FindAllUseCase;
import es.upsa.dasi.examen.domain.entities.Customer;
import es.upsa.dasi.examen.domain.exceptions.ExamenException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class FindAllUseCaseImpl implements FindAllUseCase {

    @Inject
    Dao dao;

    @Override
    public List<Customer> execute() throws ExamenException {
        return dao.findAll();
    }
}
