package es.mjim79.cursojavaweb.microservicio.controlador;

import es.mjim79.cursojavaweb.microservicio.modelo.*;

public class AlumnoRequestMapper {

    private AlumnoRequestMapper() {

    }

    public static Alumno toAlumno(AlumnoRequest alumnoRequest) {

        return Alumno.builder().id(alumnoRequest.getId()).nombre(alumnoRequest.getNombre())
                .apellidos(alumnoRequest.getApellidos()).edad(alumnoRequest.getEdad()).sexo(alumnoRequest.getSexo())
                .nacionalidad(alumnoRequest.getNacionalidad()).build();
    }

}
