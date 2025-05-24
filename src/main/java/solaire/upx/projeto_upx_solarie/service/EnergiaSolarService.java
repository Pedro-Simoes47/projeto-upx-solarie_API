package solaire.upx.projeto_upx_solarie.service;

import org.springframework.stereotype.Service;
import solaire.upx.projeto_upx_solarie.dto.EnergiaGeradaRequest;
import solaire.upx.projeto_upx_solarie.entity.EnergiaGerada;
import solaire.upx.projeto_upx_solarie.entity.PainelSolar;
import solaire.upx.projeto_upx_solarie.repository.EnergiaSolarRepository;
import solaire.upx.projeto_upx_solarie.repository.PainelSolarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EnergiaSolarService {

    private final EnergiaSolarRepository energiaSolarRepository;
    private final PainelSolarRepository painelSolarRepository;

    public EnergiaSolarService(EnergiaSolarRepository energiaSolarRepository, PainelSolarRepository painelSolarRepository) {
        this.energiaSolarRepository = energiaSolarRepository;
        this.painelSolarRepository = painelSolarRepository;
    }

    public void registrarEnergiaGerada(EnergiaGeradaRequest request) {
        Optional<PainelSolar> painel = painelSolarRepository.findById(request.getPainelId());

        if (painel.isEmpty()) {
            throw new RuntimeException("Painel não encontrado com ID: " + request.getPainelId());
        }

        EnergiaGerada energia = new EnergiaGerada();
        energia.setPainelSolar(painel.get());
        energia.setQuantidadeKwh(request.getEnergiaGerada());
        energia.setDataGeracao(request.getData());

        energiaSolarRepository.save(energia);
    }

    public List<EnergiaGerada> energiaGeradaList (){
        return energiaSolarRepository.findAll();
    }
}
