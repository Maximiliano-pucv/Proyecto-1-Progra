import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class main{
    public static void main (String[] args) throws IOException{
        HashMap <String,Sede> mapaSedes = new HashMap<String,Sede>();
        ArrayList <Sede> listaSedes = new ArrayList<Sede>();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Menu menu = new Menu();
        while(true){
            int seleccion = menu.elegirOpcion();
            Test pruebaTest = new Test();
            if(seleccion==1){
                
                Sede sederelleno = pruebaTest.rellenarSede();
                mapaSedes.put(sederelleno.retornarnombre(),sederelleno);
                listaSedes.add(sederelleno);
            }else if(seleccion==2){
                for(int i=0; i<listaSedes.size();i++){
                    Sede aux = listaSedes.get(i);
                    aux.mostrar();
                }
            }else if(seleccion == 3){
                System.out.println("seleccione la sede");
                String nombreBus = lector.readLine();
                if(mapaSedes.containsKey(nombreBus)==true){
                    Sede sedeVotacion = mapaSedes.get(nombreBus);
                    Ciudadano votante = pruebaTest.rellenarCiudadano();
                    sedeVotacion.agregar(votante);
                }else System.out.println("la sede No esta inscrita");

            }
            if(seleccion== 0) break;
        }
        
       
        /*Ciudadano testPersona = new Ciudadano(19,"Maria", "12365485-k");
        Sede testSede = new Sede("Colegio", "region de los lagos");
        testSede.agregar(testPersona);
        testSede.mostrar();*/

    }
}