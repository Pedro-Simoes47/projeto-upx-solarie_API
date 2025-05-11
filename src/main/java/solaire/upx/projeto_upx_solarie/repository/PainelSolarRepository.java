package solaire.upx.projeto_upx_solarie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solaire.upx.projeto_upx_solarie.entity.PainelSolar;
import solaire.upx.projeto_upx_solarie.entity.Usuario;

import java.util.List;

@Repository
public interface PainelSolarRepository extends JpaRepository<PainelSolar,Long> {

    List<PainelSolar> buscarPorUsuarioID(Usuario usuarioID);
}
