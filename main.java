import java.io.*;
import java.util.*;


public class main{
    public static void main (String[] args) throws IOException{
        HashMap <String,Sede> mapaSedes = new HashMap<String,Sede>();
        ArrayList <Sede> listaSedes = new ArrayList<Sede>();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Menu menu = new Menu();
        
        Ciudadano testPersona = new Ciudadano(19,"Maria", "12365485-k");
        Sede testSede = new Sede("Colegio", "region de los lagos");
        testSede.agregar(testPersona);
        mapaSedes.put(testSede.retornarnombre(),testSede);
        listaSedes.add(testSede);
        
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
            else if(seleccion == 4){
                for(int i = 0; i< listaSedes.size(); i++){
                    Sede sedes = listaSedes.get(i);
                    sedes.mostrar(sedes.retornarnombre(), sedes.retornarRegion(), sedes.retornarVotantes());
                }
            }
            else if(seleccion == 5){
                System.out.println("Ingrese el nombre de la sede");
                String nombreS = lector.readLine();
                if(mapaSedes.containsKey(nombreS)==true){
                    Sede sedeVotacion = mapaSedes.get(nombreS);
                    System.out.println("Ingrese el rut del ciudadano");
                    String rutC = lector.readLine();
                    boolean ciudadanoElim = sedeVotacion.buscar(rutC);
                    if(ciudadanoElim == true){
                        sedeVotacion.eliminar(testPersona);
                        System.out.println("El ciudadano fue eliminado");
                    }
                    else{
                        System.out.println("El ciudadano no fue encontrado");
                    }

                    
                }else System.out.println("La sede no fue encontrada");


            }
            if(seleccion== 0) break;
        }

    }
}