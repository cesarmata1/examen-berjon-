package es.upsa.dasi.examen.domain.dtos;
import lombok.*;

@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class ErrorDto {
    String message;
}
