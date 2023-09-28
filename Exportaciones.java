import java.io.*;

public class Exportaciones {
    private PrintWriter escritor;

    public Exportaciones() throws IOException{
        escritor = new PrintWriter(new BufferedWriter(new FileWriter(new File("Test.csv"))));
    }

    public void Exportar(everySede sedes){
        for(int i =0; i<sedes.getSize();i++){
            Sede aux = sedes.getSede(i);
            for(int j=0; j<aux.retornarVotantes();j++){
                
                escritor.println(aux.retornarnombre()+","+ aux.retornarRegion()+",");
            }
        }
        escritor.close();
    }
}
