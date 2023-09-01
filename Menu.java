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
        System.out.println("-TEST DE TEXTO");
    }

    public int elegirOpcion() throws IOException{
        System.out.println();
        System.out.println("Elija que desea hacer");
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

            default:
            System.out.println("nose");
            return 0;
            
        }
        return seleccion;

    }
    
}
