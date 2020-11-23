package tesci.equipo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tesci.equipo2.model.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
