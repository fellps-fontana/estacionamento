package com.api.estacionamento.services;

import com.api.estacionamento.dtos.UsuarioDto;
import com.api.estacionamento.models.UsuarioModel;
import com.api.estacionamento.repositorys.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioModel criar (UsuarioDto user){
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setNome(user.getNome());
        usuarioModel.setCpf(user.getCpf());
        usuarioModel.setTelefone(user.getTelefone());

        return usuarioRepository.save(usuarioModel);
    }

    public List<UsuarioModel> listar(){return usuarioRepository.findAll();}

    public void deletar (UUID id){
        UsuarioModel usuarioExistente = usuarioRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Usuário não encontrado"));
        usuarioRepository.deleteById(usuarioExistente.getId());
    }

    public UsuarioModel atualizar (UUID id, UsuarioDto user){
        UsuarioModel userExistente = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
        userExistente.setNome(user.getNome());
        userExistente.setCpf(user.getCpf());
        userExistente.setTelefone(user.getTelefone());
        return usuarioRepository.save(userExistente);
    }
}
