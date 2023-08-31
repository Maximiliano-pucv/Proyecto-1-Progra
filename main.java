import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class main{
    public static void main (String[] args) throws IOException{
        HashMap <String,Sede> mapaSedes = new HashMap<String,Sede>();
        ArrayList <Sede> listaSedes = new ArrayList<Sede>();
        Menu menu = new Menu();
        while(true){
            int seleccion = menu.elegirOpcion();
            if(seleccion==1){
                Test pruebaTest = new Test();
                Sede sederelleno = pruebaTest.rellenarSede();
                mapaSedes.put(sederelleno.retornarnombre(),sederelleno);
                listaSedes.add(sederelleno);
            }else if(seleccion==2){
                for(int i=0; i<listaSedes.size();i++){
                    Sede aux = listaSedes.get(i);
                    aux.mostrar();
                }
            }
            if(seleccion== 0) break;
        }
        
       
        /*Ciudadano testPersona = new Ciudadano(19,"Maria", "12365485-k");
        Sede testSede = new Sede("Colegio", "region de los lagos");
        testSede.agregar(testPersona);
        testSede.mostrar();*/

    }
}