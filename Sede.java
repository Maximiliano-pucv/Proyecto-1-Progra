//import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;



public class Sede {
    ArrayList<Ciudadano> persona;
    HashMap<String, Ciudadano> alsoPersona;
    private String nombreSede;
    private String region;
    private int nVotantes;

    public Sede(String nombreSede, String region){
        persona = new ArrayList<Ciudadano>();
        alsoPersona = new HashMap<String,Ciudadano>();
        this.nombreSede = nombreSede;
        this.region = region;
        nVotantes = 0;
    }

    public boolean buscar (String Rut){
        if(alsoPersona.containsKey(Rut)) return true;
        else return false;
    }

    public boolean agregar(Ciudadano individuo){
        if(buscar(individuo.retornarRut())==false){
            persona.add(individuo);
            alsoPersona.put(individuo.retornarRut(),individuo);
            nVotantes++;
            return true;
        }else return false;
    }
    


    /*public Ciudadano eliminar(Ciudadano individuo){
        if(buscar(individuo.retornarRut())){
            return individuo;
        }else return null;
    }*/

    public void mostrar(){
        System.out.println("-Especificaciones de la sede-");
        System.out.println("-Nombre: " +nombreSede);
        System.out.println("-Region: " +region);
        System.out.println("-Actual cantidad de votantes: " +nVotantes);
        for(int i=0; i<persona.size();i++){
            Ciudadano aux = persona.get(i);
            aux.mostrarDatos();
        }
    }
}
