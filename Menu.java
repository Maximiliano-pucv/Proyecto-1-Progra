import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
    private int seleccion;
    private BufferedReader lectura;

    public Menu(){
        seleccion =0;
        lectura = new BufferedReader( new InputStreamReader(System.in));
    }

    public void mostrarOpciones(){
        System.out.println("Elija Que desea hacer");
    }
    /*public int elegir(){
        seleccion = Integer.parseInt(lectura.readLine());
        return seleccion;
    }*/
}
