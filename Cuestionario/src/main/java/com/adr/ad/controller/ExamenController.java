package com.adr.ad.controller;

import java.time.ZonedDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adr.ad.model.AsignarExamen;
import com.adr.ad.model.Estudiante;
import com.adr.ad.model.Examen;
import com.adr.ad.model.RespuestasPreguntas;
import com.adr.ad.service.ExamenService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/examen")
public class ExamenController {

	@Autowired
	ExamenService examenService;
	
 
 
 @PostMapping("/creaExamen") 
 public ResponseEntity<List<Examen>>  crearExamen(@RequestBody List<Examen> lexamen ) {
	 
	 try {
		
		 for(int i = 0; i< lexamen.size(); i++) {
			 
		  Examen examenAdd = examenService.crearExamen(lexamen.get(i));		 
		 }
		 
		 
		 
		 List<Examen> lexamenn = examenService.listaPreguntasExamen();
		 
		return new ResponseEntity<>(lexamenn, HttpStatus.CREATED);
		 
		
	    } catch (Exception e) {
	      return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 
 }
 
 
 @PostMapping("/creaEstudiante") 
 public ResponseEntity<Estudiante>  creaEstudiante(@RequestBody Estudiante estudiante ) {
	 
	 try {
		 
		 
		 
		 Estudiante estudianteAdd =examenService.crearEstudiante(estudiante);
				 
	     
		 return new ResponseEntity<>(estudianteAdd, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 
 }
 
 @PostMapping("/asignarExamen") 
 public ResponseEntity<AsignarExamen>  asignarExamen(@RequestBody AsignarExamen asignarExamen ) {
        try {
		 
        	asignarExamen.setZona_horaria(ZonedDateTime.now().getZone().toString());
        	
        	AsignarExamen asignarExamenAdd =examenService.asignarExamen(asignarExamen);
        			 
	     
		 return new ResponseEntity<>(asignarExamenAdd, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
 }
 
 
 @PostMapping("/recopilarRespuetas") 
 public ResponseEntity<RespuestasPreguntas>  recopilarRespuestas(@RequestBody RespuestasPreguntas respuestasPreguntas ) {
        
	 int porcentaje = 0;
	   try {
		    
        	List<Examen> lexamen = examenService.listaPreguntasExamen();
        	
        	
        	if(respuestasPreguntas.getRespuesta_pregunta1().equals(lexamen.get(0).getOpcion_correcta())) {    			
    			porcentaje = porcentaje+25;
    		}
        	
        	if(respuestasPreguntas.getRespuesta_pregunta2().equals(lexamen.get(1).getOpcion_correcta())) {
    			porcentaje = porcentaje+25;
    		}
        	
        	if(respuestasPreguntas.getRespuesta_pregunta3().equals(lexamen.get(2).getOpcion_correcta())) {
    			porcentaje = porcentaje+25;
    		}
        	
        	if(respuestasPreguntas.getRespuesta_pregunta4().equals(lexamen.get(3).getOpcion_correcta())) {
    			porcentaje = porcentaje+25;
    		}
        	 	      	
        	respuestasPreguntas.setPorcentaje_obtenido(String.valueOf(porcentaje));
        	RespuestasPreguntas recopRespuestas =examenService.recopilarRespuestas(respuestasPreguntas);
        	
        	recopRespuestas.setResultado_examen(porcentaje == 100 ? "APROBADO":"NO APROBADO");
        
        	   
        	        				 
	     
		 return new ResponseEntity<>(recopRespuestas, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
 }
  
 
 
 
 

	
}
