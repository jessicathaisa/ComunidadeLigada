package io.jessicathaisa.comunidadeligada.servico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico extends Framework.Modelo.Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Override
	public Long getIdentificador() {
		// TODO Auto-generated method stub
		return super.getIdentificador();
	}
}
