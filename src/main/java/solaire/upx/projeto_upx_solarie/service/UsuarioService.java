package solaire.upx.projeto_upx_solarie.service;

import org.springframework.stereotype.Service;
import solaire.upx.projeto_upx_solarie.entity.Usuario;
import solaire.upx.projeto_upx_solarie.exception.EmailJaExisteException;
import solaire.upx.projeto_upx_solarie.exception.EmailNaoEncontradoException;
import solaire.upx.projeto_upx_solarie.exception.SenhaInvalidaException;
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
        return usuarioRepository.findByEmail(email);
    }

    public void emailExiste(String email){
        if (usuarioRepository.existsByEmail(email)) {
            throw new EmailJaExisteException("E-mail ja cadastrado: " + email);
        }
    }

    public Usuario autenticar(String email, String senha){
        Optional<Usuario> usuarioExiste = usuarioRepository.findByEmail(email);

        Usuario usuario = usuarioExiste.orElseThrow(() -> new EmailNaoEncontradoException("E-mail nao encontrado" + email));

        if(!usuario.getSenhaHash().equals(senha)){
            throw new SenhaInvalidaException("Senha incorreta!");
        }
                return usuario;

    }


}
