import java.io.*;

public class Menu {
    private int seleccion;
    private BufferedReader lectura;

    public Menu(){
        seleccion =0;
        lectura = new BufferedReader( new InputStreamReader(System.in));
    }

    private void mostrarOpciones(){
        System.out.println("1- Añadir Sede");
        System.out.println("2- Mostrar todas las Sedes y Votantes");
        System.out.println("3- Añadir Votante");
        System.out.println("4- Mostrar sedes");
        System.out.println("5- Eliminar votante de una Sede");
        System.out.println("6- Mostrar Sedes de una region");
        System.out.println("7- Exportar Sedes y Ciudadanos");
        System.out.println("8- Importar archivo CSV");
        System.out.println("0- Cerrar");
    }

    public int elegirOpcion() throws IOException{
        System.out.println();
        System.out.println("Seleccione la opcion que desea realizar");
        mostrarOpciones();
        String opcion = lectura.readLine();
        seleccion = Integer.parseInt(opcion);
        switch(seleccion){
            case 1:
            System.out.println("Nueva Sede");
            break;
            
            case 2:
            System.out.println("Mostrar sedes y ciudadanos");
            break;

            case 3:
            System.out.println("Añadir ciudadano");
            break;

            case 4:
            System.out.println("Mostrar Sedes");
            break;

            case 5:
            System.out.println("Eliminar votante de sede");
            break;

            case 6:
            System.out.println("Mostrar sedes de una region especifica");
            break;

            case 7:
            System.out.println("Exportar datos");
            break;
             
            case 8:
            System.out.println("Importar datos");
            break;
            
            default:
            System.out.println("Salir");
            return 0;
            
        }
        return seleccion;

    }
    
}
