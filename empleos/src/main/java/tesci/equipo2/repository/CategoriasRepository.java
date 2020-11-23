package tesci.equipo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tesci.equipo2.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	
}
