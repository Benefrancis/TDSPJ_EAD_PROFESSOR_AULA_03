package br.com.fiap.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_PROF_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_TBL_PROF_PRODUTO"
    )
    @SequenceGenerator(
            name = "SQ_TBL_PROF_PRODUTO",
            initialValue = 1,
            allocationSize = 1,
            sequenceName = "SQ_TBL_PROF_PRODUTO"
    )
    @Column(
            name = "ID_PRODUTO"
    )
    private Long id;

    @Column(name = "NM_PRODUTO")
    private String nome;

    @Column(name = "DESC_PRODUTO")
    private String descricao;

    @Column(name = "DT_FAB_PRODUTO")
    private LocalDateTime fabricacao;

    @Column(name = "PRECO_PRODUTO")
    private BigDecimal preco;


    public Produto(Long id, String nome, String descricao, LocalDateTime fabricacao, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.fabricacao = fabricacao;
        this.preco = preco;
    }

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public LocalDateTime getFabricacao() {
        return fabricacao;
    }

    public Produto setFabricacao(LocalDateTime fabricacao) {
        this.fabricacao = fabricacao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Produto{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", fabricacao=").append(fabricacao);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
}
