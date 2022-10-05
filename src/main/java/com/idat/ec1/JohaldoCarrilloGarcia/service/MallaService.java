package com.idat.ec1.JohaldoCarrilloGarcia.service;

import java.util.List;

import com.idat.ec1.JohaldoCarrilloGarcia.model.Malla;

public interface MallaService {
	
	void guardar (Malla malla);
	void actualizar (Malla malla);
	void eliminar (Integer id);
	List<Malla> listar();
	Malla obtener (Integer id);

}
