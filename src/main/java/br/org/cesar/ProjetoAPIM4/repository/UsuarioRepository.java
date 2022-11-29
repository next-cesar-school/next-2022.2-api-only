package br.org.cesar.ProjetoAPIM4.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.org.cesar.ProjetoAPIM4.entity.Usuario;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository <Usuario, Long> {
    
}
