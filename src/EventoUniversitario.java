public class EventoUniversitario {
    //ATRIBUTOS
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    //FIN ATRIBUTOS

    static {
        cantidadEventos = 0;
        System.out.println("Inicializador estático: se cargó la clase EventoUniversitario.");
    }

    //CONSTRUCTOR, 1ER MÉTODO
    public EventoUniversitario (String Id, String nombre, double costo, boolean esGratuito){
        this.Id =Id;
        setTitulo(nombre); //Validación del título
        this.gratuito = esGratuito;
        this.costoBase = gratuito ? 0 : costo;
        cantidadEventos ++;
    }

    //CONSTRUCTOR DE COPIA, 2DO MÉTODO
    public EventoUniversitario (EventoUniversitario otroEvento){
        this(
                otroEvento.Id + "-COPIA",
                otroEvento.titulo,
                otroEvento.costoBase,
                otroEvento.gratuito
        );
    }

    //CALCULAR COSTO ESTIMADO, 3ER MÉTODO
    public double calcularCostoEstimado (){
        if(gratuito){
            return 0;
        }
        return costoBase * 1.21;
    }

    //ASIGNAR SALA, 4TO MÉTODO

    //CREAR ACTIVIDAD, 5TO MÉTODO

    //MOSTRAR DATOS, 6TO MÉTODO
    public void mostrarDatos(){
        System.out.println("===============================================");
        System.out.println("Id: " + Id);
        System.out.println("Título: " + titulo);
        System.out.println("Costo: " + this.calcularCostoEstimado());
    }

    //OBTENER CANTIDAD DE EVENTOS, 7MO MÉTODO
    public static int getCantidadEventos(){
        return cantidadEventos;
    }

    //VALIDACIÓN DEL TÍTULO
    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        }
    }
}