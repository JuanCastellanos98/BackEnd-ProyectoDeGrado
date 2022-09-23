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

import com.uis.simom.htadm.model.Actividad;
import com.uis.simom.htadm.repository.ActividadRepository;

@Service

public class ActividadService {
	@Autowired
	private ActividadRepository actividadRepository;

	public List<Actividad> findAll() {
		// TODO Auto-generated method stub
		return actividadRepository.findAllByOrderByNombActAsc();
	}

	
	public List<Actividad> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return actividadRepository.findAll(sort);
	}

	
	public List<Actividad> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return actividadRepository.findAllById(ids);
	}

	
	public <S extends Actividad> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends Actividad> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Actividad> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteAllInBatch(Iterable<Actividad> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	
	public Actividad getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Actividad getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Actividad> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Actividad> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Page<Actividad> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Actividad> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<Actividad> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
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

	
	public void delete(Actividad entity) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll(Iterable<? extends Actividad> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends Actividad> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Actividad> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Actividad> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public <S extends Actividad> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public <S extends Actividad, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
