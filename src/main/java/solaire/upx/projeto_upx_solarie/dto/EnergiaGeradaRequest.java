package solaire.upx.projeto_upx_solarie.dto;

import java.time.LocalDate;

public class EnergiaGeradaRequest {

    private Long painelId;
    private Double energiaGerada;
    private LocalDate data;

    public EnergiaGeradaRequest() {
    }

    public EnergiaGeradaRequest(Long painelId, Double energiaGerada, LocalDate data) {
        this.painelId = painelId;
        this.energiaGerada = energiaGerada;
        this.data = data;
    }

    public Long getPainelId() {
        return painelId;
    }

    public void setPainelId(Long painelId) {
        this.painelId = painelId;
    }

    public Double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(Double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
