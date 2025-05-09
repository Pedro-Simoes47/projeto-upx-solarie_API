package solaire.upx.projeto_upx_solarie.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "energia_gerada")
public class EnergiaSolar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long energiaId;

    @Temporal(TemporalType.DATE)
    private Date dataGeracao;

    @Column(name = "quantidade_kwh")
    private Double quantidadeKwh;

    @Column()
    private Long painelID;

    public Long getEnergiaId() {
        return energiaId;
    }

    public void setEnergiaId(Long energiaId) {
        this.energiaId = energiaId;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date data) {
        this.dataGeracao = dataGeracao;
    }

    public Double getQuantidadeKwh() {
        return quantidadeKwh;
    }

    public void setQuantidadeKwh(Double quantidadeKwh) {
        this.quantidadeKwh = quantidadeKwh;
    }

    public Long getPainelID() {
        return painelID;
    }

    public void setPainelID(Long painelID) {
        this.painelID = painelID;
    }
}
