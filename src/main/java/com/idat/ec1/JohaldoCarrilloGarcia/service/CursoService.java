package com.idat.ec1.JohaldoCarrilloGarcia.service;

import java.util.List;

import com.idat.ec1.JohaldoCarrilloGarcia.model.Curso;

public interface CursoService  {
	
	void guardar (Curso curso);
	void actualizar (Curso curso);
	void eliminar (Integer id);
	List<Curso> listar();
	Curso obtener (Integer id);

}
