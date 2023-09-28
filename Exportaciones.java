import java.io.*;

public class Exportaciones {
    private PrintWriter escritor;

    public Exportaciones() throws IOException{
        escritor = new PrintWriter(new BufferedWriter(new FileWriter(new File("Test.csv"))));
    }

    public void Exportar(everySede sedes) throws AgeOutOfRangeException,RutNotOnLengthException{
        for(int i =0; i<sedes.getSize();i++){
            Sede aux = sedes.getSede(i);
            escritor.print(aux.retornarnombre()+","+ aux.retornarRegion()+",");
            for(int j=0; j<aux.retornarVotantes();j++){
                Ciudadano auxC = aux.getCiudadano(j);
                escritor.print(auxC.retornarEdad()+","+auxC.retornarNombre()+","+auxC.retornarRut()+",");
            }
            escritor.println("");
        }
        escritor.close();
    }
}
