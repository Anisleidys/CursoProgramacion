import java.io.StringBufferInputStream;

public class Ejercicio2_04 {
    public static void main (String args[]){
        String primerApellido = args[0];
        String segundoApellido = args[1];
        String nombrePrimerhijo = args[2];
        String nombreSegundohijo = args[3];
        String nombreTercerhijo = args[4];
        String nombrePadre = args[5];
        String nombreMadre = args[6];
        System.out.println("Padres: " +"\n" + nombreMadre +" "+ primerApellido + "\n" + nombrePadre +" "+ segundoApellido);
        System.out.println("Hijos " +"\n" + nombrePrimerhijo +" "+ primerApellido +" "+ segundoApellido + "\n" + nombreSegundohijo +" "+ primerApellido +" "+ segundoApellido+ "\n" + nombreTercerhijo +" "+ primerApellido +" "+ segundoApellido);
    }
}
