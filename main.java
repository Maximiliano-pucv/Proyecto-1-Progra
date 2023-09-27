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
                Sedes.mostrarCedesCiudadanos();
            }else if(seleccion == 3){
                System.out.println("seleccione la sede");
                String nombreBus = lector.readLine();
                Sedes.aniadirCiudadano(nombreBus);
            }
            else if(seleccion == 4){
                Sedes.mostrarCedes();
            }
            else if(seleccion == 5){
                System.out.println("Ingrese el nombre de la sede y el rut de la persona");
                String nombreS = lector.readLine();
                String rutBus = lector.readLine();
                Sedes.eliminarCiudadano(nombreS, rutBus);
            }
            if(seleccion== 0) break;
        }

    }
}