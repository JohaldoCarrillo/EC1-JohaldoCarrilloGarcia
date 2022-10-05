package com.idat.ec1.JohaldoCarrilloGarcia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="mallas")
public class Malla {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private String malla;
	
	@OneToMany (mappedBy = "mallas", cascade = {CascadeType.MERGE})
	private List<Curso> cursos = new ArrayList<>();
	
	@OneToOne
	private Universidad universidad;
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public String getMalla() {
		return malla;
	}
	public void setMalla(String malla) {
		this.malla = malla;
	}
	
	
}
