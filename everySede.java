import java.io.IOException;
import java.util.*;

public class everySede {
    private HashMap <String,Sede> mapaSedes;
    private ArrayList <Sede> listaSedes;

    public everySede(){
        mapaSedes = new HashMap<String,Sede>();
        listaSedes = new ArrayList<Sede>();
    }

    public void aniadirSede(Sede lugarVotacion){
        if(mapaSedes.containsKey(lugarVotacion.retornarnombre())==true){
            System.out.println("la sede ya esta inscrita");
            return;
        }
        
        mapaSedes.put(lugarVotacion.retornarnombre(),lugarVotacion);
        listaSedes.add(lugarVotacion);
    }

    public void mostrarSedesCiudadanos(){
        for(int i=0; i<listaSedes.size(); i++){
            Sede aux = listaSedes.get(i);
            aux.mostrar();
        }
    }

    public void aniadirCiudadano(String nombreSede) throws IOException, AgeOutOfRangeException,RutNotOnLengthException{
        Test placeTest = new Test(); 
        if(mapaSedes.containsKey(nombreSede)==false){
            System.out.println("la sede no esta inscrita");
            return;
        }
        else{
           try{ 
                Ciudadano ciudadanoAgregar = placeTest.rellenarCiudadano();
                Sede sedeDondeAgregar = mapaSedes.get(nombreSede);
                sedeDondeAgregar.agregar(ciudadanoAgregar);
            }catch(AgeOutOfRangeException e){
                System.out.println("error: "+ e.getMessage());
            }catch(RutNotOnLengthException r){
                System.out.println("error: "+ r.getMessage());
            }

        }
        
    }

    public void mostrarSedes(){
        for(int i = 0; i< listaSedes.size(); i++){
            Sede sedes = listaSedes.get(i);
            sedes.mostrar(sedes.retornarnombre(), sedes.retornarRegion(), sedes.retornarVotantes());
        }
    }

    public void eliminarCiudadano(String nombreSede, String rutC){
        if(mapaSedes.containsKey(nombreSede)==false){
            System.out.println("La sede no fue encontrada");
            return;
        }
        Sede sedeVotacion = mapaSedes.get(nombreSede);
        System.out.println("Ingrese el rut del ciudadano");
        if(sedeVotacion.eliminar(rutC)){
                        
            System.out.println("El ciudadano fue eliminado");
        }
        else{
            System.out.println("El ciudadano no fue encontrado");
        }
    }


}
