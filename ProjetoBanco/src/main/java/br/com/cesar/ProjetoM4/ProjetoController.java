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
public class ProjetoController {

    List<Projeto> projetos = new ArrayList<Projeto>();
    int idGenerated = 1;

    @GetMapping("/projeto")
    public List<Projeto> listaProjetos() {
        return this.projetos;
    }

    @GetMapping("/projeto/{varIdProjeto}")
    public ResponseEntity<Projeto> getProjetosById(@PathVariable(value = "varIdProjeto") long idProjeto) {
        for (int i = 0; i < projetos.size(); i++) {
            if (projetos.get(i).getIdProjeto() == idProjeto) {
                return new ResponseEntity<Projeto>(projetos.get(i), HttpStatus.OK);// status 200
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);// status 404
    }

    @PostMapping("/projeto")
    public ResponseEntity<Projeto> saveProjeto(@RequestBody Projeto entity) {
        entity.setIdProjeto(this.idGenerated++);
        this.projetos.add(entity);
        return new ResponseEntity<Projeto>(entity, HttpStatus.CREATED);
    }

    @PutMapping("/projeto/{varIdProjeto}")
    public ResponseEntity<Projeto> updateProjetoById(
            @PathVariable(value = "varIdProjeto") long idProjeto,
            @RequestBody Projeto entity) {
        for (int i = 0; i < projetos.size(); i++) {
            if (projetos.get(i).getIdProjeto() == idProjeto) {
                projetos.get(i).setNomeProjeto(entity.getNomeProjeto());
                projetos.get(i).setFuncionario(entity.getFuncionario());
                projetos.get(i).setStatus(entity.getStatus());
                projetos.get(i).setCentroDeCusto(entity.getCentroDeCusto());
                projetos.get(i).setDataInicio(entity.getDataInicio());
                projetos.get(i).setDataTermino(entity.getDataTermino());
                return new ResponseEntity<Projeto>(projetos.get(i), HttpStatus.OK);// status 200
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);// status 404
    }

    @DeleteMapping("/projeto/{idProjeto}")
    public ResponseEntity<?> deleteProjetoById(@PathVariable(value = "idProjeto") long idProjeto) {
        for (int i = 0; i < projetos.size(); i++) {
            if (projetos.get(i).getIdProjeto() == idProjeto) {
                this.projetos.remove(projetos.get(i));
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);// status 404
    }
}
