package br.org.cesar.ProjetoAPIM4.controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.cesar.ProjetoAPIM4.entity.Projeto;
// import br.org.cesar.ProjetoAPIM4.repository.ProjetoRepository;
import br.org.cesar.ProjetoAPIM4.repository.ProjetoRepository;

@RestController
@RequestMapping("/api")
public class ProjetoController {
    long idGenerated = 1;

    @Autowired
    private ProjetoRepository projetoRepository;
    
    @GetMapping("/projeto")
    public Iterable<Projeto> listaProjetos() {
        return projetoRepository.findAll();
    }

    @GetMapping("/projeto/{id}")
    public Projeto listaProjetoUnico(@PathVariable(value = "id") long idProjeto) {
        return projetoRepository.findById(idProjeto);
        
    }

    @PostMapping("/projeto")
    public ResponseEntity<Projeto> saveProjeto(@RequestBody Projeto entity) {
        entity = projetoRepository.save(entity);
        return new ResponseEntity<Projeto>(entity, HttpStatus.CREATED);
    }

    @PutMapping("/projeto")
    public ResponseEntity<Projeto> atualizaProjeto(@RequestBody Projeto entity) {
        entity = projetoRepository.save(entity);
        return new ResponseEntity<Projeto>(entity, HttpStatus.CREATED);
    }

}
