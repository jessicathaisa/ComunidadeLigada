package io.jessicathaisa.comunidadeligada.servico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Framework.DAO.ServicoDAO;

@Repository
public interface RepositorioServico extends JpaRepository<Servico, Long> {

	default public ServicoDAO<Servico> constroiServicoDao(RepositorioServico r) {
		return new ServicoDAO<Servico>() {
			@Override
			public Servico update(Servico c) {
				r.save(c);
				return c;
			}

			@Override
			public Servico retrieve(int id) {
				return r.findOne(Integer.toUnsignedLong(id));
			}

			@Override
			public Servico[] findAll() {
				return r.findAll().toArray(new Servico[0]);
			}

			@Override
			public void delete(Servico c) {
				r.delete(c);
			}

			@Override
			public Servico add(Servico c) {
				r.save(c);
				return c;
			}
		};
	}
}
