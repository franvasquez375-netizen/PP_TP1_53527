public class Taller extends Actividad{
    //ATRIBUTO
    private boolean requiereNotebook;

    //CONSTRUCTOR
    public Taller(int id, String titulo,boolean requiereNotebook, int cupo){
        super(id, titulo, cupo);
        this.requiereNotebook = requiereNotebook;
    }
    //1ER MÉTODO
    @Override
    public double calcularCostoMateriales(){
        if(requiereNotebook){
            return 5000.0;
        }
        return 2000.0;
    }

    //2DO MÉTODO
    public String getTipo(){
        return this.getClass().getSimpleName();
    }

}
