package br.com.criandoapi.projeto.repository;

import br.com.criandoapi.projeto.model.Usuario;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {



}
