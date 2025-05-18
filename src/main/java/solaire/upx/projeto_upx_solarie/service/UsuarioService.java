package solaire.upx.projeto_upx_solarie.service;

import org.springframework.stereotype.Service;
import solaire.upx.projeto_upx_solarie.entity.Usuario;
import solaire.upx.projeto_upx_solarie.exception.EmailJaExisteException;
import solaire.upx.projeto_upx_solarie.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final  UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> buscarTodosUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarPorEmail(String email){
        return usuarioRepository.buscarPorEmail(email);
    }

    public void emailExiste(String email){
        if (usuarioRepository.emailExite(email));
            throw new EmailJaExisteException("E-mail ja cadastrado: " + email);
    }


}
