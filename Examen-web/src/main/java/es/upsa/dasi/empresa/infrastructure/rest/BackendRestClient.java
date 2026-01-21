package es.upsa.dasi.empresa.infrastructure.rest;


import es.upsa.dasi.empresa.infrastructure.rest.provider.ExamenResponseExceptionMapper;
import es.upsa.dasi.examen.domain.dtos.CustomerDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient(baseUri = "http://localhost:8087")
@RegisterProvider(ExamenResponseExceptionMapper.class)
public interface BackendRestClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/customers")
    List <CustomerDto> findAll();

}
