package br.com.senac.api.entitys;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ClientesTeste {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column
    private String sobreNome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientes_teste_id")
    private List<EnderecoTeste> enderecoTestes = new ArrayList<>();

    public List<EnderecoTeste> getEnderecoTestes() {
        return enderecoTestes;
    }

    public void setEnderecoTestes(List<EnderecoTeste> enderecoTestes) {
        this.enderecoTestes = enderecoTestes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
