package solaire.upx.projeto_upx_solarie.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PainelSolar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long painelId;

    private Long usuarioId;

    private boolean ativo;

}
