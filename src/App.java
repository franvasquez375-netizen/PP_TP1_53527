import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int id = 1;

        System.out.println("REGISTRO DE EVENTOS");
        System.out.println("======================");
        System.out.println("Ingrese la cantidad de eventos:");
        int cantEventos = sc.nextInt(); //Leo la cantidad de eventos que se van a crear
        sc.nextLine();
        for(int eventosCreados = 0; eventosCreados < cantEventos; eventosCreados ++){
            //Leer valores del evento
            System.out.println("Ingrese el título del evento " + id);
            String titulo = sc.nextLine();
            System.out.println("Ingrese el costo base del evento");
            double costoBase = sc.nextDouble();
            sc.nextLine();
            System.out.println("El evento tendra costo para los participantes S/N?");
            String respuesta = sc.nextLine().trim().toLowerCase();
            boolean esGratuito= true;
            if (respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("sí")) {
                esGratuito= false;
            }

            //Creo un objeto del tipo EventoUniversitario con los valores leídos
            EventoUniversitario evento = new EventoUniversitario("EVT-" + id, titulo, costoBase, esGratuito);

            //Se muestran los datos del evento
            System.out.println("\n\nDATOS DEL EVENTO:");
            evento.mostrarDatos();

            //Creo un objeto de copia de la instancia anterior
            EventoUniversitario eventoCopia = new EventoUniversitario(evento);
            //Se muestras los datos del EVENTO DE COPIA
            System.out.println("\n\nDATOS DEL EVENTOS DE COPIA:");
            eventoCopia.mostrarDatos();
            id++;
        }
        //Mostrar la cantidad de eventos creados
        System.out.println("\nCantidad de eventos creados (originales + copia): " + EventoUniversitario.getCantidadEventos());
    }
}