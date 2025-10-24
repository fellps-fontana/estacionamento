package com.api.estacionamento.dtos;

import com.api.estacionamento.models.VagaModel;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.ArrayList;
import java.util.List;
@Data
public class UsuarioDto{

    @NotBlank(message = "Esse nome é obrigator")
    private String nome;
    private String cpf;
    private String telefone;
    private VagaModel vagas;

}
