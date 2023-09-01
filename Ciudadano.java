public class Ciudadano {
    private int edad;
    private String nombre;
    private String Rut;
    
    public Ciudadano(int edad, String nombre, String Rut){
        this.edad = edad;
        this.nombre = nombre;
        this.Rut = Rut;
    }

    //constructor usado para la función de eliminar persona
    public Ciudadano(String name, String Rut){
        this.edad = -1;
        this.nombre = name;
        this.Rut = Rut;
    }

    public Ciudadano(){
        this.edad = -1;
        this.nombre = "NO NAME";
        this.Rut = "00.000.000-0";
    }

    public void establecerdatos(int edad, String nombre, String Rut){
        this.edad = edad;
        this.nombre = nombre;
        this.Rut = Rut;
    }

    public void establecerdatos(){
        this.edad = -1;
        this.nombre = "NO NAME";
        this.Rut = "00.000.000-0";
    }

    public String retornarRut(){
        return Rut;
    }

    public String retornarNombre(){
        return nombre;
    }

    public int retornarEdad(){
        return edad;
    }

    public void setRut(String Rut){
        this.Rut = Rut;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("--------------------");
        System.out.println("Rut: " +Rut);
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("--------------------");
    }
}
