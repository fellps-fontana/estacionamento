package com.api.estacionamento.repositorys;

import com.api.estacionamento.models.VagaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VagaRepository extends JpaRepository<VagaModel, UUID> {
}
