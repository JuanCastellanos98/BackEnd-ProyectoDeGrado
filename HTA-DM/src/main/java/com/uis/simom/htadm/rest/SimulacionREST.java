package com.uis.simom.htadm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uis.simom.htadm.service.SimulacionService;
import com.uis.simom.htadm.model.Simulacion;
//import com.uis.simom.htadm.model.SimulacionPaciente;
import com.uis.simom.htadm.model.ModeloSimulacion;

@RestController
@RequestMapping("/simulaciones/")
public class SimulacionREST {

	@Autowired
	private SimulacionService simulacionService;

	@GetMapping
	private ResponseEntity<List<Simulacion>> getAllActividades() {
		return ResponseEntity.ok(simulacionService.findAll());
	}

	@PostMapping
	private ModeloSimulacion simuFra(@RequestBody Simulacion simulacionpaciente) {
		ModeloSimulacion modeloSimulacion = new ModeloSimulacion();
		modeloSimulacion.calcularRiesgo(simulacionpaciente.getEdad(), simulacionpaciente.getTiempo(),
				simulacionpaciente.getSexo(), simulacionpaciente.getAltura(), simulacionpaciente.getHerencia(),
				simulacionpaciente.getFumar(), simulacionpaciente.getCalorias(), simulacionpaciente.getUpDownCalorias(),
				simulacionpaciente.getUpDown(), simulacionpaciente.getPeso(), simulacionpaciente.getSbp(),
				simulacionpaciente.getDbp(), simulacionpaciente.getSemanaC(), simulacionpaciente.getSemanaF(), 0, 10, 0,
				30, 0, 20, 10, 20, 1, 1, 1, 1, 0, 1);
		return modeloSimulacion;

	}

}
