package br.com.senac.api.entitys;

import jakarta.persistence.*;

@Entity
public class Mix {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 2)
    private float quanridade;

    @ManyToOne
    @JoinColumn(name = "lojas_id")
    private Lojas lojas;

    @ManyToOne
    @JoinColumn(name = "produtos_id")
    private Produtos produtos;

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public Lojas getLojas() {
        return lojas;
    }

    public void setLojas(Lojas lojas) {
        this.lojas = lojas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getQuanridade() {
        return quanridade;
    }

    public void setQuanridade(float quanridade) {
        this.quanridade = quanridade;
    }
}
