package com.uis.simom.htadm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simom.htadm.model.Enfermero;
import com.uis.simom.htadm.service.EnfermeroService;

@RestController
@RequestMapping("/enfermeros/")

public class EnfermeroREST {
	
	
	@Autowired
	private EnfermeroService enfermeroService;
	
	@GetMapping
	private ResponseEntity<List<Enfermero>> getAllEnfermeros(){
		return ResponseEntity.ok(enfermeroService.findAll());
	}
	
	
	
	

}
