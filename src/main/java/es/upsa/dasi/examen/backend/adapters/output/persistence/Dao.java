package es.upsa.dasi.examen.backend.adapters.output.persistence;
import es.upsa.dasi.examen.domain.entities.Customer;
import es.upsa.dasi.examen.domain.exceptions.ExamenException;

import java.util.List;

public interface Dao {
    List<Customer> findAll() throws ExamenException;
}
