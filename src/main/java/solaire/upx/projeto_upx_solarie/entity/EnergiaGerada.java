package solaire.upx.projeto_upx_solarie.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "energia_gerada")
public class EnergiaGerada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long energiaId;

    @Temporal(TemporalType.DATE)
    private LocalDate dataGeracao;

    @Column(name = "quantidade_kwh")
    private Double quantidadeKwh;

    @ManyToOne
    @JoinColumn(name = "painel_id")
    private PainelSolar painelSolar;

    public Long getEnergiaId() {
        return energiaId;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate data) {
        this.dataGeracao = dataGeracao;
    }

    public Double getQuantidadeKwh() {
        return quantidadeKwh;
    }

    public void setQuantidadeKwh(Double quantidadeKwh) {
        this.quantidadeKwh = quantidadeKwh;
    }

    public Long getPainelSolar() {
        return painelSolar.getID();
    }

}
