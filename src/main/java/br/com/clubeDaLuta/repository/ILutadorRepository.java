package br.com.clubeDaLuta.repository;

import br.com.clubeDaLuta.domain.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILutadorRepository extends JpaRepository<Lutador, Long> {
}
