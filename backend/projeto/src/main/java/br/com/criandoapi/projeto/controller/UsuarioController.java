package br.com.criandoapi.projeto.controller;

import br.com.criandoapi.projeto.model.Usuario;
import br.com.criandoapi.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
@Autowired
private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listaUsuarios(){
    return (List< Usuario >) repository.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> excluirUsuario (@PathVariable Integer id){
        Optional<Usuario> usuario = repository.findById(id);
     repository.deleteById(id);
        return usuario;


    }





}


