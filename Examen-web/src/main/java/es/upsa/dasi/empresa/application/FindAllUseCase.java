package es.upsa.dasi.empresa.application;
import es.upsa.dasi.examen.domain.dtos.CustomerDto;
import java.util.List;

public interface FindAllUseCase {
    List <CustomerDto> execute();
}
