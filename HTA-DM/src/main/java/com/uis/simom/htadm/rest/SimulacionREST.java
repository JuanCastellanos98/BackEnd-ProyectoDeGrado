 package com.uis.simom.htadm.rest;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uis.simom.htadm.service.SimulacionService;
import com.uis.simom.htadm.model.Simulacion;
import com.uis.simom.htadm.model.ModeloSimulacion;


@RestController
@RequestMapping("/simulaciones/")
public class SimulacionREST {
	
	
	
	@Autowired
	private SimulacionService simulacionService;	
	
	
	@GetMapping
	private ResponseEntity<List<Simulacion>> getAllActividades(){
		return ResponseEntity.ok(simulacionService.findAll());
	}

	
	@GetMapping("frami/{edad}")
	private ModeloSimulacion  simuFra(@PathVariable Integer edad) {
		ModeloSimulacion modeloSimulacion = new ModeloSimulacion();
		modeloSimulacion.calcularRiesgo(50, edad,1,1.60,1, 1,2000, 5, 1, 70, 120, 80,80,2, 0, 10, 0, 30, 0, 20, 10, 20, 1, 1, 1, 1, 0, 1);
		
		return modeloSimulacion;
	}
	

}


