package solaire.upx.projeto_upx_solarie.service;

import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.stereotype.Service;
import solaire.upx.projeto_upx_solarie.entity.PainelSolar;
import solaire.upx.projeto_upx_solarie.entity.Usuario;
import solaire.upx.projeto_upx_solarie.repository.PainelSolarRepository;

import java.util.List;

@Service
public class PainelSolarService {

    public final PainelSolarRepository painelSolarRepository;

    public PainelSolarService(PainelSolarRepository painelSolarRepository) {
        this.painelSolarRepository = painelSolarRepository;
    }

    public List<PainelSolar> buscarTodos(){
        return painelSolarRepository.findAll();
    }

    public List<PainelSolar> buscarPorUsuarioID(Usuario usuarioID){
        return painelSolarRepository.buscarPorUsuarioID(usuarioID);
    }

}
