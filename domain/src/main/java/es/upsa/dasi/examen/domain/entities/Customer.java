package es.upsa.dasi.examen.domain.entities;
import lombok.*;

@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class Customer {
    String id;
    String name;
    String email;
    float bonus;
}
