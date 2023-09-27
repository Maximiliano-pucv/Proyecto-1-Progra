public class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(){
        super("La edad se encuentra fuera de rango o no es la suficiente para poder votar");

    }
}