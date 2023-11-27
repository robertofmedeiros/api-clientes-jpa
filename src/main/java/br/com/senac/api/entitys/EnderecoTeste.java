package br.com.senac.api.entitys;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class EnderecoTeste {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String rua;

    @Column
    private String bairro;

    @ManyToOne
    @JoinColumn(name = "clientes_teste_id")
    private ClientesTeste clientesTeste;

    public ClientesTeste getClientesTeste() {
        return clientesTeste;
    }

    public void setClientesTeste(ClientesTeste clientesTeste) {
        this.clientesTeste = clientesTeste;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
