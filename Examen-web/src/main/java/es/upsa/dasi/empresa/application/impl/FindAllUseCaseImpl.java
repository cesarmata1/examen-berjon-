package es.upsa.dasi.empresa.application.impl;
import es.upsa.dasi.empresa.application.FindAllUseCase;
import es.upsa.dasi.empresa.infrastructure.rest.BackendRestClient;
import es.upsa.dasi.examen.domain.dtos.CustomerDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import java.util.List;

@ApplicationScoped
public class FindAllUseCaseImpl implements FindAllUseCase {

    @Inject
    @RestClient
    BackendRestClient backendRestClient;

    @Override
    public List<CustomerDto> execute() {
        return backendRestClient.findAll();
    }
}
