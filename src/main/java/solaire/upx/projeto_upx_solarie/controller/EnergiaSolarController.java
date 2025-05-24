package solaire.upx.projeto_upx_solarie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solaire.upx.projeto_upx_solarie.dto.EnergiaGeradaRequest;
import solaire.upx.projeto_upx_solarie.entity.EnergiaGerada;
import solaire.upx.projeto_upx_solarie.service.EnergiaSolarService;

import java.util.List;

@RestController
@RequestMapping("/energia")
public class EnergiaSolarController {

    private final EnergiaSolarService energiaSolarService;

    public EnergiaSolarController(EnergiaSolarService energiaSolarService) {
        this.energiaSolarService = energiaSolarService;
    }

    @PostMapping
    public ResponseEntity<String> registrarEnergia(@RequestBody EnergiaGeradaRequest request) {
        try {
            energiaSolarService.registrarEnergiaGerada(request);
            return ResponseEntity.status(HttpStatus.CREATED).body("Energia registrada com sucesso.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/energia-gerada")
    public List<EnergiaGerada> buscarEnergiaGerada(){
        return energiaSolarService.energiaGeradaList();
    }
}
