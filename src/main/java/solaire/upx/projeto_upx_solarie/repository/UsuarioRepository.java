package solaire.upx.projeto_upx_solarie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solaire.upx.projeto_upx_solarie.entity.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> buscarPorEmail(String email);

    boolean emailExite(String email);

}
