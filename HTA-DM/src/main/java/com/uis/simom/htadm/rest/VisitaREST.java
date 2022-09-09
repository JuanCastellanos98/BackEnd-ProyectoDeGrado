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

import com.uis.simom.htadm.model.Paciente;
import com.uis.simom.htadm.model.Visita;
//import com.uis.simom.htadm.service.EnfermeroService;
//import com.uis.simom.htadm.service.PacienteService;
import com.uis.simom.htadm.service.VisitaService;

@RestController
@RequestMapping("/visitas/")
public class VisitaREST {
	@Autowired
	private VisitaService visitaService;

	//private PacienteService pacienteService;
	//private EnfermeroService enfermeroService;

	@GetMapping
	private ResponseEntity<List<Visita>> getAllActividades() {
		return ResponseEntity.ok(visitaService.findAll());
	}

	@GetMapping("visitaPaciente/{ccPacientes}")
	private ResponseEntity<List<Visita>> getAllVisitasByPaciente(@PathVariable("ccPacientes") String ccPaciente) {
		System.out.print(ccPaciente);
		return ResponseEntity.ok(visitaService.findAllVisitasByPaciente(ccPaciente));
	}

	@GetMapping("{enfermeroPacientes}")
	private ResponseEntity<List<Paciente>> getAllPacientesByEnferfemero(
			@PathVariable("enfermeroPacientes") String ccEnfermero) {
		System.out.print(ccEnfermero);
		return ResponseEntity.ok(visitaService.findAllPacientesByEnfermero(ccEnfermero));
	}

	@PostMapping
	private ResponseEntity<Visita> saveVisita(@RequestBody Visita visita) {
		System.out.print(visita);
		try {
			Visita visitaGuardada = visitaService.save(visita);
			return ResponseEntity.created(new URI("/visitas/" + visitaGuardada.getId())).body(visitaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
