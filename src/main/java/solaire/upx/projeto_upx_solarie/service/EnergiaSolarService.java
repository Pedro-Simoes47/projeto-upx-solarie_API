package solaire.upx.projeto_upx_solarie.service;

import org.springframework.stereotype.Service;
import solaire.upx.projeto_upx_solarie.entity.EnergiaGerada;
import solaire.upx.projeto_upx_solarie.repository.EnergiaSolarRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class EnergiaSolarService {
    private final EnergiaSolarRepository energiaSolarRepository;

    public EnergiaSolarService(EnergiaSolarRepository repository){
        this.energiaSolarRepository = repository;
    }

    public List<EnergiaGerada> buscarTodos(){
        return energiaSolarRepository.findAll();
    }

    public List<EnergiaGerada> buscarPorData(LocalDate data){
        return energiaSolarRepository.buscarPorDataGeracao(data);
    }


}
