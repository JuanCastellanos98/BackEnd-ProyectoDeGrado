package com.uis.simom.htadm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.uis.simom.htadm.model.Alimento;
import com.uis.simom.htadm.service.AlimentoService;

@RestController
@RequestMapping("/alimentos/")

public class AlimentoREST {
	
	
	@Autowired
	private AlimentoService alimentoService;
	@GetMapping
	private ResponseEntity<List<Alimento>> getAllAlimentos(){
		return ResponseEntity.ok(alimentoService.findAll());
	}
	
	

}
