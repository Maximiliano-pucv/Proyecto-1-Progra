import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;



public class Sede {
    ArrayList persona;
    HashMap alsoPersona;

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
        if(buscar(individuo.Rut)==false){
            persona.add(individuo);
            alsoPersona.put(individuo.Rut,individuo);
            return true;
        }else return false;
    }
    


    public Ciudadano eliminar(Ciudadano individuo){
        if(buscar(individuo.Rut)){
            persona.
        }else return NULL;
    }

    public void mostrar(){

    }
}
