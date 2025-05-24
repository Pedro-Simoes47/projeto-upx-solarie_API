package solaire.upx.projeto_upx_solarie.dto;

import solaire.upx.projeto_upx_solarie.entity.Usuario;

public class CriarPainelRequest {

    private String nomePainel;

    private Long usuarioID;

    public CriarPainelRequest(String nomePainel, Long usuarioID) {
        this.nomePainel = nomePainel;
        this.usuarioID = usuarioID;
    }

    public Long getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(Long usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getNomePainel() {
        return nomePainel;
    }

    public void setNomePainel(String nomePainel) {
        this.nomePainel = nomePainel;
    }
}
