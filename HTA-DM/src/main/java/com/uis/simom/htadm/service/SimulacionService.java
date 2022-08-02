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

import com.uis.simom.htadm.model.Simulacion;
import com.uis.simom.htadm.repository.SimulacionRepository;

@Service
public class SimulacionService implements SimulacionRepository{
	@Autowired
	private SimulacionRepository simulacionRepository;

	@Override
	public List<Simulacion> findAll() {
		// TODO Auto-generated method stub
		return simulacionRepository.findAll();
	}

	@Override
	public List<Simulacion> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return simulacionRepository.findAll(sort);
	}

	@Override
	public List<Simulacion> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return simulacionRepository.findAllById(ids);
	}

	@Override
	public <S extends Simulacion> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return simulacionRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Simulacion> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Simulacion> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Simulacion> entities) {
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
	public Simulacion getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Simulacion getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Simulacion> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Simulacion> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Simulacion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Simulacion> S save(S entity) {
		// TODO Auto-generated method stub
		return simulacionRepository.save(entity);
	}

	@Override
	public Optional<Simulacion> findById(Long id) {
		// TODO Auto-generated method stub
		return simulacionRepository.findById(id);
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
	public void delete(Simulacion entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Simulacion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Simulacion> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Simulacion> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Simulacion> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Simulacion> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Simulacion, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
