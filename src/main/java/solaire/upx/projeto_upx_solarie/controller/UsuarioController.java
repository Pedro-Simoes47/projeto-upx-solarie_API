package solaire.upx.projeto_upx_solarie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solaire.upx.projeto_upx_solarie.dto.LoginRequest;
import solaire.upx.projeto_upx_solarie.entity.Usuario;
import solaire.upx.projeto_upx_solarie.exception.EmailJaExisteException;
import solaire.upx.projeto_upx_solarie.exception.EmailNaoEncontradoException;
import solaire.upx.projeto_upx_solarie.exception.SenhaInvalidaException;
import solaire.upx.projeto_upx_solarie.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<?> criarUsuario(@RequestBody Usuario usuario){
        try{
            usuarioService.emailExiste(usuario.getEmail());
            usuarioService.salvarUsuario(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (EmailJaExisteException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }


        @PostMapping("/login")
        public ResponseEntity<?> login(@RequestBody LoginRequest login){
            try {
                Usuario usuario = usuarioService.autenticar(login.getEmail(), login.getSenha());
                return ResponseEntity.ok("Login realizado com sucesso!");
            }catch (EmailJaExisteException | SenhaInvalidaException e){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
            }

        }
    }




