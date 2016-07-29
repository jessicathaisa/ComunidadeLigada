package io.jessicathaisa.comunidadeligada.prestador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "prestador", path = "prestador")
public interface RepositorioPrestador extends JpaRepository<Prestador, Long> {

}
