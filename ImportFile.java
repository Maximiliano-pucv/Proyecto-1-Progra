import java.io.*;
public class ImportFile {
    private String fileName;
    private BufferedReader lector;

    public ImportFile()throws FileNotFoundException{
        fileName = "Test.csv";
        lector = new BufferedReader(new FileReader(fileName));

    }

    public everySede importarArchivo() throws IOException, AgeOutOfRangeException, RutNotOnLengthException{
        everySede importacion = new everySede();
        String linea = lector.readLine();
        while(linea != null){
            linea = lector.readLine();
            if(linea == null) break;
            String parametros[]= linea.split(",");
            Sede PosibleSede = new Sede(parametros[0], parametros[1]);
            if(importacion.aniadirSede(PosibleSede)==true){
                //caso en el que se agregue una sede aun no inscrita
                Ciudadano NuevoCiudadano= new Ciudadano(Integer.parseInt(parametros[3]), parametros[4], parametros[5]);
                importacion.aniadirCiudadano(parametros[0],NuevoCiudadano);
            }else{
                Ciudadano NuevoCiudadano= new Ciudadano(Integer.parseInt(parametros[3]), parametros[4], parametros[5]);
                importacion.aniadirCiudadano(parametros[0],NuevoCiudadano);
            }

        }
        lector.close();
        return importacion;
    }
}
