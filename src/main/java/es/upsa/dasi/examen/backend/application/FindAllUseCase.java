package es.upsa.dasi.examen.backend.application;
import es.upsa.dasi.examen.domain.entities.Customer;
import es.upsa.dasi.examen.domain.exceptions.ExamenException;
import java.util.List;

public interface FindAllUseCase {
    List <Customer> execute() throws ExamenException;
}
