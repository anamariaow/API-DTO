package it.develhope.apiStart.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDTO {
    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String name;
    @NotBlank(message = "Mandatory")
    private String surname;
//not blank con dependency validation
}
