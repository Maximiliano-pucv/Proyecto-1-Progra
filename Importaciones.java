import java.io.*;

public class Importaciones {
    private Ciudadano personasExt = new Ciudadano();
    private Sede sedeExt = new Sede();
    BufferedReader lectorText = new BufferedReader(new InputStreamReader(System.in));
    private String textoLeer;


    public everySede verificarTexto()throws IOException, NumberFormatException, AgeOutOfRangeException, RutNotOnLengthException{
        System.out.println("Ingrese el nombre del archivo que quiere importar");
        textoLeer = lectorText.readLine();
        String aux [] = textoLeer.split("\\.");
        if(aux[1].equals("csv")){
            return leerCsv(textoLeer);
        }
        else return null;
    }

    //orden : NombreSede,Region,nVotantes,Edad1,Nombre1,Rut1,Edad2,Nombre2,Rut2,EdadN,NombreN,RutN

    public everySede leerCsv(String texto) throws IOException,NumberFormatException ,AgeOutOfRangeException, RutNotOnLengthException{
        everySede resultado = new everySede();
        BufferedReader lector = new BufferedReader(new FileReader(texto));
        String linea = lector.readLine();
        
        while(linea != null){
            String datos[] = linea.split(",");
            int cont = 0;
            for(int i = 0; i< datos.length;i++){
                if (i ==0){
                    sedeExt.setNombre(datos[i]);
                }
                else if (i == 1){
                    sedeExt.setRegion(datos[i]);
                }
                else if(i == 2){
                    int numV = Integer.parseInt(datos[i]);
                    sedeExt.setVotantes(numV);
                }
                else if(i >= 3){
                    if (cont == 0){
                        int edad = Integer.parseInt(datos[i]);
                        personasExt.setEdad(edad);
                        cont++;
                    }
                    else if (cont == 1){
                        personasExt.setNombre(datos[i]);
                        cont++;
                    }
                    else if(cont == 2){
                        personasExt.setRut(datos[i]);
                        cont++;
                    }
                    if (cont == 3){
                        sedeExt.agregar(personasExt);
                        cont = 0;
                    }
                }

            }
            resultado.aniadirSede(sedeExt);
            linea = lector.readLine();
        }
        lector.close();
        return resultado;
    }
}
