import java.io.*;
//import java.util.*;


public class main{
    public static void main (String[] args) throws IOException,RutNotOnLengthException,AgeOutOfRangeException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Menu menu = new Menu();
        everySede Sedes = new everySede();
        Ciudadano testPersona = new Ciudadano(19,"Maria", "12365485-k");
        Sede testSede = new Sede("Colegio", "region de los lagos");
        testSede.agregar(testPersona);
        Sedes.aniadirSede(testSede);
        
        while(true){
            int seleccion = menu.elegirOpcion();
            Test pruebaTest = new Test();
            if(seleccion==1){
                Sede sederelleno = pruebaTest.rellenarSede();
                Sedes.aniadirSede(sederelleno);
            }else if(seleccion==2){
                Sedes.mostrarSedesCiudadanos();
            }else if(seleccion == 3){
                System.out.println("Ingrese el nombre de la sede en la que agregara");
                String nombreBus = lector.readLine();
                Sedes.aniadirCiudadano(nombreBus);
            }
            else if(seleccion == 4){
                Sedes.mostrarSedes();
            }
            else if(seleccion == 5){
                System.out.println("Ingrese el nombre de la sede");
                String nombreS = lector.readLine();
                System.out.println("Ingrese el rut del ciudadano");
                String rutBus = lector.readLine();
                Sedes.eliminarCiudadano(nombreS, rutBus);
            }
            if(seleccion == 0) break;
        }

    }
}