package solaire.upx.projeto_upx_solarie.service;

import org.springframework.stereotype.Service;
import solaire.upx.projeto_upx_solarie.model.EnergiaSolar;
import solaire.upx.projeto_upx_solarie.repository.EnergiaSolarRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class EnergiaSolarService {
    private EnergiaSolarRepository energiaSolarRepository;

    public EnergiaSolarService(EnergiaSolarRepository repository){
        this.energiaSolarRepository = repository;
    }

    public List<EnergiaSolar> buscarTodos(){
        return energiaSolarRepository.findAll();
    }

    public List<EnergiaSolar> buscarPorData(LocalDate data){
        return energiaSolarRepository.findByDate(data);
    }
}
