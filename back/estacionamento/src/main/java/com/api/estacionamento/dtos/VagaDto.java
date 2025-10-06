package com.api.estacionamento.dtos;

import jakarta.validation.constraints.NotBlank;

public class VagaDto {
    @NotBlank(message = "O número é obrigatório")
    private Number numero;
    private String bloco;
}
