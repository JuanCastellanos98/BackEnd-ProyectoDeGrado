package com.uis.simom.htadm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uis.simom.htadm.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente,Long>{
	
	Optional<Paciente> findByCc(String cc); 

}