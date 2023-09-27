//Esta clase no es lo principal, como dice el nombre de la clase, es para hacer pruebas

import java.io.*;
public class Test {
    public Ciudadano rellenarCiudadano() throws IOException, AgeOutOfRangeException,RutNotOnLengthException{

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese los datos de el ciudadano");
        Ciudadano prueba = new Ciudadano();
        System.out.println("---NOMBRE---");
        String nombre = lector.readLine();
        System.out.println("---RUT---");
        String Rut = lector.readLine();
        System.out.println("---EDAD---");
        int edad = Integer.parseInt(lector.readLine());
        prueba.setEdad(edad);
        prueba.setRut(Rut);
        prueba.setNombre(nombre);
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
