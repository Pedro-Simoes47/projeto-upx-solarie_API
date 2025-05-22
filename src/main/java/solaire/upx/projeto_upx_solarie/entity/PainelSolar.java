package solaire.upx.projeto_upx_solarie.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "painel_solar")
public class PainelSolar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    private boolean ativo;

    @OneToMany(mappedBy = "painelSolar", cascade = CascadeType.ALL)
    private List<EnergiaGerada> energiaGeradas;

    public Long getID() {
        return ID;
    }

    public List<EnergiaGerada> getEnergiaGeradas() {
        return energiaGeradas;
    }

    public void setEnergiaGeradas(List<EnergiaGerada> energiaGeradas) {
        this.energiaGeradas = energiaGeradas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
