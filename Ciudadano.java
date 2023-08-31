public class Ciudadano {
    private int edad;
    private String nombre;
    private String Rut;
    
    public Ciudadano(int edad, String nombre, String Rut){
        this.edad = edad;
        this.nombre = nombre;
        this.Rut = Rut;
    }
    public String retornarRut(){
        return nombre;
    }
    public void mostrarDatos(){
        System.out.println("--------------------");
        System.out.println("Rut: " +Rut);
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad" +edad);
        System.out.println("--------------------");
    }
}
