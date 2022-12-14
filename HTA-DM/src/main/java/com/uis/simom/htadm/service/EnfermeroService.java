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

import com.uis.simom.htadm.model.Enfermero;
import com.uis.simom.htadm.repository.EnfermeroRepository;

@Service

public class EnfermeroService implements EnfermeroRepository {
	@Autowired
	private EnfermeroRepository enfermeroRepository;

	@Override
	public List<Enfermero> findAll() {
		// TODO Auto-generated method stub
		return enfermeroRepository.findAll();
	}
	
	public Enfermero findAllByCC(String cc){
		Enfermero respuestaEnfermero=new Enfermero();
		List<Enfermero> enfermero= enfermeroRepository.findAll();
		for(int i=0; i<enfermero.size();i++) {
			if(enfermero.get(i).getCc().equals(cc)   ) {
				respuestaEnfermero=(enfermero.get(i));
				//System.out.print("entro");
			}
		}
		return respuestaEnfermero;
	}

	@Override
	public List<Enfermero> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return enfermeroRepository.findAll(sort);
	}

	@Override
	public List<Enfermero> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return enfermeroRepository.findAllById(ids);
	}

	@Override
	public <S extends Enfermero> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Enfermero> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enfermero> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Enfermero> entities) {
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
	public Enfermero getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public Enfermero getById(Long id) {
		// TODO Auto-generated method stub
		return enfermeroRepository.getById(id);
	}

	@Override
	public <S extends Enfermero> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enfermero> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Enfermero> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enfermero> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Enfermero> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
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
	public void delete(Enfermero entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Enfermero> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Enfermero> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enfermero> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enfermero> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Enfermero> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Enfermero, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
