package es.mjim79.cursojavaweb.microservicio.servicio;

import java.util.*;

import es.mjim79.cursojavaweb.microservicio.modelo.*;

public interface ServicioAlumno {

    Alumno crearAlumno(Alumno alumno);

    List<Alumno> obtenerTodosLosAlumnos();

}
