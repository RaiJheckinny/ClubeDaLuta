package br.com.clubeDaLuta.repository;

import br.com.clubeDaLuta.domain.Apostador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IApostadorRepository extends JpaRepository<Apostador, Long> {
}
