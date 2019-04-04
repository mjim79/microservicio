package es.mjim79.cursojavaweb.microservicio.modelo;

public class AlumnoException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -8985000569350784572L;

    public AlumnoException(String msg) {
        super(msg);
    }

    public AlumnoException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
