package es.mjim79.cursojavaweb.microservicio.servicio.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import es.mjim79.cursojavaweb.microservicio.modelo.*;
import es.mjim79.cursojavaweb.microservicio.repositorio.*;
import es.mjim79.cursojavaweb.microservicio.servicio.*;

@Service
public class ServicioAlumnoImpl implements ServicioAlumno {

    private final RepositorioAlumno repositorioAlumno;

    @Autowired
    public ServicioAlumnoImpl(RepositorioAlumno repositorioAlumno) {
        this.repositorioAlumno = repositorioAlumno;
    }

    @Override
    public Alumno crearAlumno(Alumno alumno) {
        return this.repositorioAlumno.save(alumno);

    }

    @Override
    public List<Alumno> obtenerTodosLosAlumnos() {
        return this.repositorioAlumno.findAll();
    }

}
