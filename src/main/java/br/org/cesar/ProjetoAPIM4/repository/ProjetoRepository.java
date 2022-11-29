package br.org.cesar.ProjetoAPIM4.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.org.cesar.ProjetoAPIM4.entity.Projeto;

@Repository
public interface ProjetoRepository extends PagingAndSortingRepository <Projeto, Long> {
    
    Projeto findById(long idProjeto);
}
