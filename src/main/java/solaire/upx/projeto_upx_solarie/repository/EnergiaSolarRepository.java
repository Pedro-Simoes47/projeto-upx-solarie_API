package solaire.upx.projeto_upx_solarie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solaire.upx.projeto_upx_solarie.model.EnergiaSolar;

import java.time.LocalDate;
import java.util.List;

public interface EnergiaSolarRepository extends JpaRepository<EnergiaSolar,Long> {
    List<EnergiaSolar> findByDate(LocalDate date);
}
