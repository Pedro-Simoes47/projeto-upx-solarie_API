package solaire.upx.projeto_upx_solarie.controller;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import solaire.upx.projeto_upx_solarie.entity.EnergiaGerada;
import solaire.upx.projeto_upx_solarie.service.EnergiaSolarService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/energia")
public class EnergiaSolarController {

    private EnergiaSolarService service;

    public EnergiaSolarController(EnergiaSolarService service) {
        this.service = service;
    }

    @GetMapping
    public List<EnergiaGerada> buscarTodos(){
        return service.buscarTodos();
    }

    @GetMapping("/data")
    public List<EnergiaGerada> buscarPorData(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
        return service.buscarPorData(date);
    }
}
