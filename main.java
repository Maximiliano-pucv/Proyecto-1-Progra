import java.io.*;
//import java.util.ArrayList;




public class main{
    public static void main (String[] args) throws IOException{
        Ciudadano testPersona = new Ciudadano(19,"Maria", "12365485-k");
        Sede testSede = new Sede("Colegio", "region de los lagos");
        testSede.agregar(testPersona);
        testSede.mostrar();

    }
}