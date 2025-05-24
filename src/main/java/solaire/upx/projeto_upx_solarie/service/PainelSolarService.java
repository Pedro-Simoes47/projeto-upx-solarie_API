package solaire.upx.projeto_upx_solarie.service;

import org.springframework.stereotype.Service;
import solaire.upx.projeto_upx_solarie.dto.CriarPainelRequest;
import solaire.upx.projeto_upx_solarie.entity.PainelSolar;
import solaire.upx.projeto_upx_solarie.entity.Usuario;
import solaire.upx.projeto_upx_solarie.repository.PainelSolarRepository;
import solaire.upx.projeto_upx_solarie.repository.UsuarioRepository;

import java.util.List;

@Service
public class PainelSolarService {

    public final PainelSolarRepository painelSolarRepository;
    public final UsuarioRepository usuarioRepository;

    public PainelSolarService(PainelSolarRepository painelSolarRepository, UsuarioRepository usuarioRepository) {
        this.painelSolarRepository = painelSolarRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public List<PainelSolar> buscarTodos(){
        return painelSolarRepository.findAll();
    }

    public List<PainelSolar> buscarPorUsuarioID(Usuario usuarioID){
        return painelSolarRepository.findByUsuario(usuarioID);
    }

    public PainelSolar criarPainel(CriarPainelRequest request){
       Usuario usuario = usuarioRepository.findById(request.getUsuarioID()).orElseThrow(() -> new RuntimeException("Usuario nao encontrado" + request.getUsuarioID()));

        PainelSolar painelSolar = new PainelSolar();
        painelSolar.setNome(request.getNomePainel());
        painelSolar.setUsuario(usuario);

        return painelSolarRepository.save(painelSolar);
    }

}
