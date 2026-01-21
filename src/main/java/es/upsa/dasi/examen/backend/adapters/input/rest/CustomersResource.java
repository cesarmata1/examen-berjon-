package es.upsa.dasi.examen.backend.adapters.input.rest;
import es.upsa.dasi.examen.backend.application.FindAllUseCase;
import es.upsa.dasi.examen.domain.dtos.CustomerDto;
import es.upsa.dasi.examen.domain.entities.Customer;
import es.upsa.dasi.examen.domain.exceptions.ExamenException;
import es.upsa.dasi.examen.domain.mappers.Mappers;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/customers")
public class CustomersResource {

    @Inject
    FindAllUseCase findAllUseCase;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() throws ExamenException {
        List < Customer> customers = findAllUseCase.execute();
        List < CustomerDto> customerDtos = customers.stream()
                .map(customer -> Mappers.toCustomerDto(customer)).toList();
        return Response.ok(customerDtos).build();
    }
}
