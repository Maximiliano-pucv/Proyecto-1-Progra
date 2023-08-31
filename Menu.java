import java.io.*;

public class Menu {
    private int seleccion;
    private BufferedReader lectura;

    public Menu(){
        seleccion =0;
        lectura = new BufferedReader( new InputStreamReader(System.in));
    }

    private void mostrarOpciones(){
        System.out.println("-Aniadir Sede");
        System.out.println("-Mostrar todas las sedes y Votantes");
        System.out.println("-Aniadir Votante");
        System.out.println("-TEST DE TEXTO");
    }

    public int elegirOpcion() throws IOException{
        System.out.println("Elija Que desea hacer");
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
            System.out.println("Aniadir ciudadano");
            break;

            default:
            System.out.println("nose");
            return 0;
            
        }
        return seleccion;

    }
    
}
