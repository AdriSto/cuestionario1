package com.adr.ad.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignarexamen")
public class AsignarExamen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "id_estudiante")
	private String id_estudiante;
	
	@Column(name = "examen_asignado")
	private String examen_asignado;
	
	@Column(name = "fecha_examen")
	private String fecha_examen;
	
	@Column(name = "hora_examen")
	private String hora_examen;
	
	@Column(name = "zona_horaria")
	private String zona_horaria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(String id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public String getExamen_asignado() {
		return examen_asignado;
	}

	public void setExamen_asignado(String examen_asignado) {
		this.examen_asignado = examen_asignado;
	}

	public String getFecha_examen() {
		return fecha_examen;
	}

	public void setFecha_examen(String fecha_examen) {
		this.fecha_examen = fecha_examen;
	}

	public String getHora_examen() {
		return hora_examen;
	}

	public void setHora_examen(String hora_examen) {
		this.hora_examen = hora_examen;
	}

	public String getZona_horaria() {
		return zona_horaria;
	}

	public void setZona_horaria(String zona_horaria) {
		this.zona_horaria = zona_horaria;
	}

	@Override
	public String toString() {
		return "AsignarExamen [id=" + id + ", id_estudiante=" + id_estudiante + ", examen_asignado=" + examen_asignado
				+ ", fecha_examen=" + fecha_examen + ", hora_examen=" + hora_examen + ", zona_horaria=" + zona_horaria
				+ "]";
	}

	
	



	
	
	

}
