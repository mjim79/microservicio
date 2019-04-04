package es.mjim79.cursojavaweb.microservicio.repositorio;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import es.mjim79.cursojavaweb.microservicio.modelo.*;

@Repository
public interface RepositorioAlumno extends JpaRepository<Alumno, Integer> {

}
