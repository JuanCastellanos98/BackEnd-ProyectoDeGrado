package com.uis.simom.htadm.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simom.htadm.service.ActividadService;
import com.uis.simom.htadm.model.Actividad;

@RestController
@RequestMapping("/actividades/")
public class ActividadREST {
	
	
	@Autowired
	private ActividadService actividadService;
	
	@GetMapping
	private ResponseEntity<List<Actividad>> getAllActividades(){
		return ResponseEntity.ok(actividadService.findAll());
	}
	

}
