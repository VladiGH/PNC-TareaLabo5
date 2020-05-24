package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Estudiante;

public interface EstudianteService {

	public List<Estudiante> findAll() throws DataAccessException;
	
	public void saveEstudiante(Estudiante e) throws DataAccessException;
	
	public void delete(Integer codigoEstudiante) throws DataAccessException;
}
