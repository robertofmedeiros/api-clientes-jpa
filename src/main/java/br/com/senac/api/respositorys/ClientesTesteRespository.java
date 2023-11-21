package br.com.senac.api.respositorys;

import br.com.senac.api.entitys.ClientesTeste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesTesteRespository extends JpaRepository<ClientesTeste, Long> {
}
