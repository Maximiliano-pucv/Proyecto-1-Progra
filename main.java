import java.io.*;
//import java.util.ArrayList;
import java.util.HashMap;




public class main{
    public static void main (String[] args) throws IOException{
        HashMap <String,Sede> mapaSedes = new HashMap<String,Sede>();
        Menu menu = new Menu();
        while(true){
            if(menu.elegirOpcion()==1){
                Test pruebaTest = new Test();
                Sede seleCiudadano = pruebaTest.rellenarSede();
                mapaSedes.put(seleCiudadano.retornarnombre(),seleCiudadano);
            }
        }
        
       
        /*Ciudadano testPersona = new Ciudadano(19,"Maria", "12365485-k");
        Sede testSede = new Sede("Colegio", "region de los lagos");
        testSede.agregar(testPersona);
        testSede.mostrar();*/

    }
}