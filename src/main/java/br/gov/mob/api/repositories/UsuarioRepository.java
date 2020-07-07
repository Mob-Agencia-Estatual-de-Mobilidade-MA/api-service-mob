package br.gov.mob.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.gov.mob.api.models.Usuario;


@EnableJpaRepositories
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
