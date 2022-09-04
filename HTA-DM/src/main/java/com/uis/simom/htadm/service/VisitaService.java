package com.uis.simom.htadm.service;

import java.util.ArrayList;
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
import com.uis.simom.htadm.model.Visita;

import com.uis.simom.htadm.repository.VisitaRepository;

@Service
public class VisitaService implements VisitaRepository {
	@Autowired
	private VisitaRepository visitaRepository;

	@Override
	public List<Visita> findAll() {
		// TODO Auto-generated method stub
		return visitaRepository.findAll();
	}

	public List<Visita> findAllVisitasByEnfermero(String cc){
		List<Visita> respuestaVisita= new ArrayList<>();
		List<Visita> visita= visitaRepository.findAll();
		for(int i=0; i<visita.size();i++) {
			if(visita.get(i).getEnfermero().getCc().equals(cc)) {
				respuestaVisita.add(visita.get(i));
				
			}
		}
		return respuestaVisita;
	}
	public List<Visita> findAllVisitasByPaciente(String cc){
		List<Visita> respuestaVisita= new ArrayList<>();
		List<Visita> visita= visitaRepository.findAll();
		for(int i=0; i<visita.size();i++) {
			if(visita.get(i).getPaciente().getCc().equals(cc)) {
				respuestaVisita.add(visita.get(i));
			}
		}
		return respuestaVisita;
	}
	
	public List<Paciente> findAllPacientesByEnfermero(String cc){
		List<Paciente> respuestaVisitaPaciente= new ArrayList<>();
		List<Visita> visita= visitaRepository.findAll();
		int respuestasRepetidas=0;
		for(int i=0; i<visita.size();i++) {
			if(visita.get(i).getEnfermero().getCc().equals(cc)) {
				if(respuestaVisitaPaciente.contains(visita.get(i).getPaciente())) {
					respuestasRepetidas=respuestasRepetidas+1;
				}else {
					respuestaVisitaPaciente.add(visita.get(i).getPaciente());
					}
				
				
			}
		}
		return respuestaVisitaPaciente;
	}
	
	
	@Override
	public List<Visita> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return visitaRepository.findAll(sort);
	}

	@Override
	public List<Visita> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return visitaRepository.findAllById(ids);
	}

	@Override
	public <S extends Visita> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return visitaRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Visita> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Visita> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Visita> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Visita getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visita getById(Long id) {
		// TODO Auto-generated method stub
		return visitaRepository.getById(id);
	}

	@Override
	public <S extends Visita> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return visitaRepository.findAll(example);
	}

	@Override
	public <S extends Visita> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Visita> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Visita> S save(S entity) {
		// TODO Auto-generated method stub
		return visitaRepository.save(entity);
	}

	@Override
	public Optional<Visita> findById(Long id) {
		// TODO Auto-generated method stub
		return visitaRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Visita entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Visita> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Visita> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Visita> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Visita> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Visita> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Visita, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
