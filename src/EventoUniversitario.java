import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventoUniversitario {
    //Atributos
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    //CLASES RELACIONADAS
    private Sala sala;
    //Creación de la lista
    private List<Actividad> actividades = new ArrayList<>();
    //FIN CLASES RELACIONADAS

    //Iniciador estático
    static{
        cantidadEventos = 0;
        System.out.println("Inicializador estático: se cargó la clase EventoUniversitario");
    }

    //1ER MÉTODO, CONSTRUCTOR
    public EventoUniversitario (String id, String titulo, double costo,boolean gratuito){
        this.Id = id;
        setTitulo(titulo); //Lo uso porque hay validación para que el titulo no esté vacío.
        this.costoBase = gratuito ? 0 : costo;
        this.gratuito = gratuito;
        cantidadEventos++;
        this.actividades = new ArrayList<>();
    }

    //2DO MÉTODO, CONSTRUCTOR DE COPIA
    public EventoUniversitario(EventoUniversitario otroEvento){
        this(
                otroEvento.Id + "-COPIA",
                otroEvento.titulo,
                otroEvento.costoBase,
                otroEvento.gratuito
        );
        this.sala = otroEvento.sala;
    }

    //3ER MÉTODO, Calculo el costo base, si el evento no es gratuito
    public double  calcularCostoEstimado(double costoBase){
        if(gratuito){
            return 0;
        }
        return costoBase*1.21;
    }
    //4TO MÉTODO, Asigno la sala
    public void asignarSala(Sala sala){
        this.sala = sala;
    }

    //5TO MÉTODO, Constructor de la actividad y la añado a la lista. Relación de composición actividad/es-Evento
    public void crearActividad(int id, String titulo, int cupo){
        Actividad actividad = new  Actividad(id,titulo,cupo);
        this.actividades.add(actividad);
    }

    //6TO MÉTODO, Mostrar los datos de los eventos creados y su copia
    public void mostrarDatos(){
        System.out.println("===================================");
        System.out.println("Id: "+Id);
        System.out.println("Título: "+titulo);
        System.out.println("Costo estimado: "+calcularCostoEstimado(costoBase));
        System.out.println("Sala asignada: "+sala.getNombre());
        System.out.println("\nActividades:");
        System.out.println("------------------------------------");
        for (Actividad actividad : actividades){
            System.out.println("- " +actividad.getTitulo() + "(id=" +actividad.getId()+ ")" + " - Cupo máximo: " + actividad.getCupoMaximo());
            actividad.mostrarInscripciones();
        }
        System.out.println("==============================================");
    }

    //7MO MÉTODO
    public static int getCantidadEventos(){
        return cantidadEventos;
    }

    public String getId() {
        return Id;
    }

    public static void setCantidadEventos(int cantidadEventos) {
        EventoUniversitario.cantidadEventos = cantidadEventos;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        }
    }
    //declaro get para obtener la lista de actividades
    public List<Actividad> getActividades(){
        return Collections.unmodifiableList(actividades);
    }

}
