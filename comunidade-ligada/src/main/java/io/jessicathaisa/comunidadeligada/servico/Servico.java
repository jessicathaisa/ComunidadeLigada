package io.jessicathaisa.comunidadeligada.servico;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico extends Framework.Modelo.Servico {

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
	public String getDescricao() {
		return super.getDescricao();
	}
	
}
