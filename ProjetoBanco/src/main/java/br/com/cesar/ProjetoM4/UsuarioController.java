package br.com.cesar.ProjetoM4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiv1")
public class UsuarioController {

    List<Usuario> usuarios = new ArrayList<Usuario>();
    long idGenerated = 1;

    @GetMapping("/usuario")
    public List<Usuario> listaUsuarios() {
        return this.usuarios;
    }

    @GetMapping("/usuario/{varIdFuncionario}")
    public ResponseEntity<Usuario> getUsuariosById(@PathVariable(value = "varIdFuncionario") long idFuncionario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdFuncionario() == idFuncionario) {
                return new ResponseEntity<Usuario>(usuarios.get(i), HttpStatus.OK);// status 200
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);// status 404
    }

    @PostMapping("/funcionario")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario entity) {
        entity.setIdFuncionario(this.idGenerated++);
        this.usuarios.add(entity);
        return new ResponseEntity<Usuario>(entity, HttpStatus.CREATED);
    }
}
