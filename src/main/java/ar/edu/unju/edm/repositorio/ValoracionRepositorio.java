package ar.edu.unju.edm.repositorio;

import ar.edu.unju.edm.modelo.Valoracion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoracionRepositorio extends CrudRepository<Valoracion, Long> {
}
