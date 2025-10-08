package com.api.estacionamento.controllers;

import com.api.estacionamento.dtos.UsuarioDto;
import com.api.estacionamento.models.UsuarioModel;
import com.api.estacionamento.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(@RequestBody @Valid UsuarioDto usuarioDto){
        UsuarioModel user = usuarioService.criar(usuarioDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
