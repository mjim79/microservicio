package es.mjim79.cursojavaweb.microservicio.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import es.mjim79.cursojavaweb.microservicio.modelo.*;
import es.mjim79.cursojavaweb.microservicio.servicio.*;

@RestController
public class ControladorAlumno {

    private final ServicioAlumno servicioAlumno;

    @Autowired
    public ControladorAlumno(ServicioAlumno servicioAlumno) {
        this.servicioAlumno = servicioAlumno;
    }

    @PostMapping("/alumnos")
    public Alumno crearAlumno(@RequestBody Alumno alumno) {

        return this.servicioAlumno.crearAlumno(alumno);
    }

    @GetMapping("/alumnos")
    public List<Alumno> obtenerTodosLosAlumnos() {
        return this.servicioAlumno.obtenerTodosLosAlumnos();
    }

}
