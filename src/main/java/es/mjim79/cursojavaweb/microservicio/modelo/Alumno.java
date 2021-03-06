package es.mjim79.cursojavaweb.microservicio.modelo;

import javax.persistence.*;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Alumno {

    @Id
    private Integer id;

    private String apellidos;

    private String nombre;

    private String sexo;

    private int edad;

    private String nacionalidad;

}
