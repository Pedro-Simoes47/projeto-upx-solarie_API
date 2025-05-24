package solaire.upx.projeto_upx_solarie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solaire.upx.projeto_upx_solarie.dto.CriarPainelRequest;
import solaire.upx.projeto_upx_solarie.entity.PainelSolar;
import solaire.upx.projeto_upx_solarie.service.PainelSolarService;

import java.util.List;

@RestController
@RequestMapping("/painel")
public class PainelController {

    private final PainelSolarService painelSolarService;

    public PainelController(PainelSolarService painelSolarService) {
        this.painelSolarService = painelSolarService;
    }


    @PostMapping("/create")
    public ResponseEntity<PainelSolar> criarPainel(@RequestBody CriarPainelRequest request) {
        PainelSolar novoPainel = painelSolarService.criarPainel(request);
        return ResponseEntity.ok(novoPainel);
    }


    @GetMapping("/paineis")
    public ResponseEntity<List<PainelSolar>> buscarTodos() {
        return ResponseEntity.ok(painelSolarService.buscarTodos());
    }
}
