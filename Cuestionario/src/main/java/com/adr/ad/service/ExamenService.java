package com.adr.ad.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adr.ad.model.AsignarExamen;
import com.adr.ad.model.Estudiante;
import com.adr.ad.model.Examen;
import com.adr.ad.model.RespuestasPreguntas;
import com.adr.ad.repository.AsignarExamRespository;
import com.adr.ad.repository.EstudianteRepository;
import com.adr.ad.repository.ExamenRepository;
import com.adr.ad.repository.RecopilarRespuestasRepository;

@Service
public class ExamenService {
	
	@Autowired
	ExamenRepository examenRep;
	
	@Autowired
	EstudianteRepository estudianteRep;
		
	@Autowired
	AsignarExamRespository asignarExamResp;
	
		
	@Autowired
	RecopilarRespuestasRepository recopilarRespuestasRep;
	
	
	public Examen crearExamen (Examen examen) {
		return examenRep.save(examen);
	}
	
	public List<Examen> listaPreguntasExamen () {
		return examenRep.findAll();
	}
	
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return estudianteRep.save(estudiante);
		
	}
	
	public Optional<Estudiante> consultaEstudianteID(long id_estudiante) {
		return estudianteRep.findById(id_estudiante);
		
	}
	
	public AsignarExamen asignarExamen(AsignarExamen asignarExamen) {
		return asignarExamResp.save(asignarExamen);
	}

		
	public Optional<AsignarExamen> consultaEstatusExamenID(long id_estudiante) {
		return asignarExamResp.findById(id_estudiante);
		
	}

	
	public RespuestasPreguntas recopilarRespuestas(RespuestasPreguntas respuestasPreguntas) {
		return recopilarRespuestasRep.save(respuestasPreguntas);
	}

}
