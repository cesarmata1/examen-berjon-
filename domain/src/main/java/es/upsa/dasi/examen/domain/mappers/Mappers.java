package es.upsa.dasi.examen.domain.mappers;

import es.upsa.dasi.examen.domain.dtos.CustomerDto;
import es.upsa.dasi.examen.domain.entities.Customer;

public class Mappers {
    public static CustomerDto toCustomerDto (Customer customer){
        return CustomerDto.builder()
                .withId(customer.getId())
                .withName(customer.getName())
                .withEmail(customer.getEmail())
                .build();
    }
}
