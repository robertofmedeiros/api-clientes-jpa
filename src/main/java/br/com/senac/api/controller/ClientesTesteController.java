package br.com.senac.api.controller;

import br.com.senac.api.entitys.ClientesTeste;
import br.com.senac.api.respositorys.ClientesTesteRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClientesTesteController {

    @Autowired
    private ClientesTesteRespository clientesTesteRespository;

    @PostMapping("/")
    public ResponseEntity<?> criarCliente
            (@RequestBody ClientesTeste clientesTeste) {
        ClientesTeste teste = clientesTesteRespository.save(clientesTeste);

        return ResponseEntity.ok(teste);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCliente
            (@PathVariable Long id,
             @RequestBody ClientesTeste clientesTeste){
        ClientesTeste teste = clientesTesteRespository.findById(id).map(record -> {
            record.setNome(clientesTeste.getNome());
            record.setSobreNome(clientesTeste.getSobreNome());
            record.setEnderecoTestes(clientesTeste.getEnderecoTestes());
            return clientesTesteRespository.save(record);
        }).get();

        return ResponseEntity.ok(teste);
    }

}
