package com.api.estacionamento.dtos;

import com.api.estacionamento.models.VagaModel;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDto{

    @NotBlank(message = "Esse nome é obrigator")
    private String nome;
    @CNPJ
    private String cnpj;
    private String telefone;
    private List<VagaModel> vagas = new ArrayList<>();

}
