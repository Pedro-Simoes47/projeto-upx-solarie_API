package solaire.upx.projeto_upx_solarie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solaire.upx.projeto_upx_solarie.entity.EnergiaGerada;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EnergiaSolarRepository extends JpaRepository<EnergiaGerada,Long> {
    List<EnergiaGerada> findByDataGeracao(LocalDate dataGeracao);
}
