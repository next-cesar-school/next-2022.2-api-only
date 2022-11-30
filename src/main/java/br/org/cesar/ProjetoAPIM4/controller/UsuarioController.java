package br.org.cesar.ProjetoAPIM4.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.org.cesar.ProjetoAPIM4.entity.Usuario;
import br.org.cesar.ProjetoAPIM4.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    List<Usuario> usuarios = new ArrayList<Usuario>();
    long idGenerated = 1;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuario")
    public Iterable<Usuario> listaProjetos() {
        return usuarioRepository.findAll();
    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario entity) {
        entity = usuarioRepository.save(entity);
        return new ResponseEntity<Usuario>(entity, HttpStatus.CREATED);
    }
}
