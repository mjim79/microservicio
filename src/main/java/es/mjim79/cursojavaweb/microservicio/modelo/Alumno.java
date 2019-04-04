package es.mjim79.cursojavaweb.microservicio.modelo;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
public class Alumno {

    @Id
    // @GeneratedValue
    private Integer id;

    private String apellidos;

    private String nombre;

    private String sexo;

    private int edad;

    private String nacionalidad;

    public Alumno() {
        super();
    }

    public Alumno(Integer codigo, String apellidos, String nombre, String sexo, int edad, String nacionalidad) {
        super();
        this.id = codigo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}
