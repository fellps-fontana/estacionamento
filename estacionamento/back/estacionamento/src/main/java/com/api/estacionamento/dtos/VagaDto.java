package com.api.estacionamento.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class VagaDto {
    @NotBlank(message = "O número é obrigatório")
    private Number numero;
    private String bloco;
}
