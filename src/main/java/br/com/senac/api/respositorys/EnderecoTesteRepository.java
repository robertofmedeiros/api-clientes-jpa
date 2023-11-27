package br.com.senac.api.respositorys;

import br.com.senac.api.entitys.EnderecoTeste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoTesteRepository extends JpaRepository<EnderecoTeste, Long> {
}