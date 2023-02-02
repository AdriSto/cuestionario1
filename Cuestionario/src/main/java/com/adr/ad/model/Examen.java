package com.adr.ad.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "examen")
public class Examen {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "pregunta")
	private String pregunta;
	
	@Column(name = "opcion_A")
	private String opcion_A;

	
	@Column(name = "opcion_B")	
	private String opcion_B;
	

	@Column(name = "opcion_C")	
	private String opcion_C;
	
	
	@Column(name = "opcion_D")
	private String opcion_D;
	
	
	@Column(name = "opcion_correcta")
	private String opcion_correcta;
	
	
	


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getPregunta() {
		return pregunta;
	}



	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}



	public String getOpcion_A() {
		return opcion_A;
	}



	public void setOpcion_A(String opcion_A) {
		this.opcion_A = opcion_A;
	}



	public String getOpcion_B() {
		return opcion_B;
	}



	public void setOpcion_B(String opcion_B) {
		this.opcion_B = opcion_B;
	}



	public String getOpcion_C() {
		return opcion_C;
	}



	public void setOpcion_C(String opcion_C) {
		this.opcion_C = opcion_C;
	}



	public String getOpcion_D() {
		return opcion_D;
	}



	public void setOpcion_D(String opcion_D) {
		this.opcion_D = opcion_D;
	}



	public String getOpcion_correcta() {
		return opcion_correcta;
	}



	public void setOpcion_correcta(String opcion_correcta) {
		this.opcion_correcta = opcion_correcta;
	}



	public Examen( String pregunta, String opcionA, String opcionB, String opcionC, String opcionD,
			String opcionCorrecta) {
		super();
		this.pregunta = pregunta;
		this.opcion_A = opcionA;
		this.opcion_B = opcionB;
		this.opcion_C = opcionC;
		this.opcion_D = opcionD;
		this.opcion_correcta = opcionCorrecta;
	}



	public Examen() {
		
	}



	@Override
	public String toString() {
		return "Examen [id=" + id + ", pregunta=" + pregunta + ", opcion_A=" + opcion_A + ", opcion_B=" + opcion_B + ", opcion_C=" + opcion_C +", opcion_D=" + opcion_D +", opcion_correcta=" + opcion_correcta + "]";
	}
}
