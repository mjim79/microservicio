package es.mjim79.cursojavaweb.microservicio.controlador;

import lombok.*;

@Data
public class AlumnoRequest {

    private Integer id;

    private String apellidos;

    private String nombre;

    private String sexo;

    private int edad;

    private String nacionalidad;

}
