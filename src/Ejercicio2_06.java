
public class Ejercicio2_06{
        public static void main (String[]args){
            String primerApellido = args[0];
            String segundoApellido = args[1];
            String nombrePrimerhijo = args[2];
            String nombreSegundohijo = args[3];
            String nombreTercerhijo = args[4];
            String nombrePadre = args[5];
            String nombreMadre = args[6];

            pintaPersona(nombrePadre, primerApellido, "");
            pintaPersona(nombreMadre, segundoApellido, "");
            pintaPersona(nombrePrimerhijo, primerApellido, segundoApellido);
            pintaPersona(nombreSegundohijo, primerApellido, segundoApellido);
            pintaPersona(nombreTercerhijo, primerApellido, segundoApellido);

        }

        private static void pintaPersona(String nombre, String primerApellido, String segundoApellido){
            System.out.println("Nombre: " + nombre + " Apellidos: " + primerApellido + " " + segundoApellido);
        }

        }



