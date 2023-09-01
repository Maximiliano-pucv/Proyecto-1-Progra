//import java.io.*;
import java.util.*;


public class Sede {
    private ArrayList<Ciudadano> persona;
    private HashMap<String, Ciudadano> alsoPersona;
    private String nombreSede;
    private String region;
    private int nVotantes;

    public Sede(String nombreSede, String region){
        this.persona = new ArrayList<>();
        this.alsoPersona = new HashMap<>();
        this.nombreSede = nombreSede;
        this.region = region;
        nVotantes = 0;
    }

    public String retornarnombre(){
        return nombreSede;
    }

    public String retornarRegion(){
        return region;
    }

    public int retornarVotantes(){
        return nVotantes; 
    }

    public void setNombre(String nombreSede){
        this.nombreSede = nombreSede;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public void setVotantes(int nVotantes){
        this.nVotantes = nVotantes;
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
    
    public boolean eliminar(Ciudadano persona){
        if(alsoPersona.containsKey(persona.retornarRut()) == true){
persona = alsoPersona.get(persona.retornarRut());
            alsoPersona.remove(persona.retornarRut());
            this.persona.remove(this.persona.indexOf(persona));
            nVotantes--;
            return true;
        }
        return false;
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
