package es.upsa.dasi.empresa.adapters.input.mvc;

import es.upsa.dasi.empresa.application.FindAllUseCase;
import es.upsa.dasi.examen.domain.dtos.CustomerDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.mvc.UriRef;
import jakarta.mvc.View;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;

@ApplicationScoped
@Path("/customers")
public class CustomersResource {

    @Inject
    FindAllUseCase findAllUseCase;

    @Inject
    Models models;

    @GET
    @Controller
    @View("/jsps/customers.jsp")
    @UriRef("findAll")
    public  void findAll(){
        List<CustomerDto> customerDtos = findAllUseCase.execute();
        models.put("customers", customerDtos);
    }
}
