package io.jessicathaisa.comunidadeligada.servico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "oferta", path = "oferta")
public interface RepositorioOferta extends JpaRepository<Oferta, Long> {

}
