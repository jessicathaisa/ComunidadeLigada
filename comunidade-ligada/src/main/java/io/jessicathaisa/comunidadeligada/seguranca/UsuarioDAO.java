package io.jessicathaisa.comunidadeligada.seguranca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByLogin(String login);

}
