package solaire.upx.projeto_upx_solarie.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "dados_energia")
public class EnergiaSolar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "energiaGerada")
    private Double energiaGerada;

    private Long panelID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date data) {
        this.date = date;
    }

    public Double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(Double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    public Long getPanelID() {
        return panelID;
    }

    public void setPanelID(Long panelID) {
        this.panelID = panelID;
    }
}
