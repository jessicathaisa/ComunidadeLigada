package io.jessicathaisa.comunidadeligada.servico;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Oferta extends Framework.Modelo.Oferta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdentificador() {
		return super.getIdentificador();
	}

	@Basic
	public Date getDataInicio() {
		return super.getDataInicio();
	}

	@Basic
	public Date getDataFim() {
		return super.getDataFim();
	}

	@Basic
	public float getValor() {
		return super.getValor();
	}

	@Basic
	public String getDescricao() {
		return super.getDescricao();
	}

	
	
	
	
	
	
	private io.jessicathaisa.comunidadeligada.prestador.Prestador prestador;
	
	@ManyToOne
	public io.jessicathaisa.comunidadeligada.prestador.Prestador getPrestador() {
		return prestador;
	}
	
	public void setPrestador(io.jessicathaisa.comunidadeligada.prestador.Prestador prestador) {
		this.prestador = prestador;
	}
	
	private io.jessicathaisa.comunidadeligada.servico.Servico servico;
	
	@ManyToOne
	public io.jessicathaisa.comunidadeligada.servico.Servico getServico() {
		return this.servico;
	}
	
	public void setServico(io.jessicathaisa.comunidadeligada.servico.Servico servico) {
		this.servico = servico;
	}
}
