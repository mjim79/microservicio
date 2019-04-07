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
    public Alumno crearAlumno(@RequestBody AlumnoRequest alumnoRequest) {

        return this.servicioAlumno.crearAlumno(AlumnoRequestMapper.toAlumno(alumnoRequest));
    }

    @GetMapping("/alumnos")
    public List<Alumno> obtenerTodosLosAlumnos() {
        return this.servicioAlumno.obtenerTodosLosAlumnos();
    }

    @GetMapping("/alumnos/{id}")
    public Alumno obtenerAlumnoPorId(@PathVariable Integer id) {
        return this.servicioAlumno.obtenerAlumnoPorId(id);
    }

    @PutMapping("/alumnos/{id}")
    public void actualizarAlumno(@PathVariable Integer id, @RequestBody AlumnoRequest alumnoRequest) {

        this.servicioAlumno.actualizarAlumno(id, AlumnoRequestMapper.toAlumno(alumnoRequest));
    }

    @DeleteMapping("/alumnos/{id}")
    public void eliminarAlumno(@PathVariable Integer id) {

        this.servicioAlumno.eliminarAlumno(id);
    }

}
