package es.upsa.dasi.empresa.infrastructure.rest.provider;

import es.upsa.dasi.empresa.domain.exceptions.ExamenRunTimeException;
import es.upsa.dasi.empresa.domain.exceptions.ProductoNotFoundRunTimeException;
import es.upsa.dasi.examen.domain.dtos.ErrorDto;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

public class ExamenResponseExceptionMapper implements ResponseExceptionMapper <ExamenRunTimeException> {

    @Override
    public ExamenRunTimeException toThrowable(Response response) {
        Response.Status status = response.getStatusInfo().toEnum();
        return switch (status){
            case NOT_FOUND -> new ProductoNotFoundRunTimeException();
            default -> {
                ErrorDto errorDto = response.readEntity(ErrorDto.class);
                yield new ExamenRunTimeException(errorDto.getMessage());
            }
        };
    }
}
