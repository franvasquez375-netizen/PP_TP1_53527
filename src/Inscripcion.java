import java.time.LocalDate;

public class Inscripcion {
    //Atributos
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;
    private Actividad actividad;

    //Constructor
    public Inscripcion(LocalDate fecha, String estado, Estudiante estudiante,Actividad actividad ) {
        this.actividad=actividad;
        this.estudiante=estudiante;
        this.fecha = fecha;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "Fecha=" + fecha +
                "Estado='" + estado + '\'' +
                "Estudiante=" + estudiante +
                "Actividad=" + actividad +
                '}';
    }

    //Getter y Setters

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
}
