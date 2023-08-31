//Esta clase no es lo principal, como dice el nombre de la clase, es para hacer pruebas

import java.io.*;
public class Test {
    public Ciudadano rellenarCiudadano() throws IOException{

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese los datos de el ciudadano");
        Ciudadano prueba = new Ciudadano();
        String nombre = lector.readLine();
        String Rut = lector.readLine();
        int edad = Integer.parseInt(lector.readLine());
        prueba.establecerdatos(edad, nombre, Rut);
        return prueba;
    }
    public Sede rellenarSede()throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese nombre y la region donde se ubica");
        String nombre = lector.readLine();
        String region = lector.readLine();
        Sede nuevaSede = new Sede(nombre, region);
        return nuevaSede;
    }
}
