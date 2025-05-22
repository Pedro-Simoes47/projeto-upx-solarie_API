package solaire.upx.projeto_upx_solarie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solaire.upx.projeto_upx_solarie.service.PainelSolarService;

@RestController
@RequestMapping("/painel-solar")
public class PainelController {

    private PainelSolarService painelSolarService;

    public PainelController(PainelSolarService painelSolarService) {
        this.painelSolarService = painelSolarService;
    }


}
