package br.org.cesar.ProjetoAPIM4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.org.cesar.ProjetoAPIM4.entity.CentroCusto;

@Repository
public interface CentroCustoRepository extends PagingAndSortingRepository <CentroCusto, Long> {
    
}
