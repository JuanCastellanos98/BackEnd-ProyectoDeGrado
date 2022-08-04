package com.uis.simom.htadm.rest;


import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simom.htadm.service.PacienteService;
import com.uis.simom.htadm.model.Paciente;

@RestController
@RequestMapping("/pacientes/")
public class PacienteREST {
	
	
	@Autowired
	private PacienteService PacienteService;
	
	@GetMapping
	private ResponseEntity<List<Paciente>> getAllActividades(){
		return ResponseEntity.ok(PacienteService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Paciente> savePaciente(@RequestBody Paciente paciente){
		
		
		try {
			Paciente pacienteGuardado= PacienteService.save(paciente);
			
			return ResponseEntity.created(new URI("/pacientes/"+pacienteGuardado.getId())).body(pacienteGuardado);
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	

}
