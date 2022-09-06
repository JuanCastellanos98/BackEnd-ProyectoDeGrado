package com.uis.simom.htadm.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;


import com.uis.simom.htadm.model.Paciente;
import com.uis.simom.htadm.repository.PacienteRepository;

@Service
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	public List<Paciente> findAll() {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll();
	}
	
	public Paciente findAllByCC(String cc){
		Paciente respuestaPaciente=new Paciente();
		List<Paciente> paciente= pacienteRepository.findAll();
		for(int i=0; i<paciente.size();i++) {
			if(paciente.get(i).getCc().equals(cc)   ) {
				respuestaPaciente=(paciente.get(i));
				//System.out.print("entro");
			}
		}
		return respuestaPaciente;
	}
	
	public Paciente buscaPorCedula(String cc) {		
		return pacienteRepository.findByCc(cc).get();
	}
	

	
	public List<Paciente> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll(sort);
	}

	
	public List<Paciente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return pacienteRepository.findAllById(ids);
	}

	
	public <S extends Paciente> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return pacienteRepository.saveAll(entities);
	}

	
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends Paciente> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Paciente> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteAllInBatch(Iterable<Paciente> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	
	public Paciente getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Paciente getById(Long id) {
		// TODO Auto-generated method stub
		return pacienteRepository.getById(id);
	}

	
	public <S extends Paciente> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Paciente> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Page<Paciente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Paciente> S save(S entity) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(entity);
	}

	
	public Optional<Paciente> findById(Long id) {
		// TODO Auto-generated method stub
		return pacienteRepository.findById(id);
	}

	
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Paciente entity) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll(Iterable<? extends Paciente> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends Paciente> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Paciente> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Paciente> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public <S extends Paciente> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public <S extends Paciente, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
