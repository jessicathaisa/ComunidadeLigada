package io.jessicathaisa.comunidadeligada.prestador;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestador extends Framework.Modelo.Prestador {

	public void avaliar() {
		// TODO:Implementar
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdentificador() {
		return super.getIdentificador();
	}

	@Basic
	public String getNome() {
		return super.getNome();
	}

	@Basic
	public int getAvaliacao() {
		return super.getAvaliacao();
	}

	@Basic
	public String getUri() {
		return super.getUri();
	}
}
