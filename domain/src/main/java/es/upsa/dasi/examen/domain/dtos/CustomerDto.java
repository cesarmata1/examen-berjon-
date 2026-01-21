package es.upsa.dasi.examen.domain.dtos;
import lombok.*;

@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class CustomerDto {
    String id;
    String name;
    String email;
}

