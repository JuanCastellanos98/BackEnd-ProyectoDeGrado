package com.uis.simom.htadm.rest;


import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("{id}")
	private Paciente getOneByid(@PathVariable("id") long idPaciente){
		Paciente resenf=new Paciente();
		resenf=PacienteService.getOne(idPaciente);
		return resenf;
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
	
	@PostMapping("loginPaciente/")
	private Paciente  login(@RequestBody Paciente paciente) {
		Paciente resenf=new Paciente();
		Paciente resplog=new Paciente();
		resenf=PacienteService.findAllByCC(paciente.getCc());
		if(paciente.getPassword().equals(resenf.getPassword())) {
			resplog=resenf;
		}else {
			resplog=null;
		}
		System.out.print(resplog);
		return resplog;
	}
	
	
	

}
