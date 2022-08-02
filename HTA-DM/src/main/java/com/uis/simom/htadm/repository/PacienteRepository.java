package com.uis.simom.htadm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uis.simom.htadm.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente,Long>{
	

}