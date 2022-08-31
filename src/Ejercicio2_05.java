public class Ejercicio2_05 {
    public static void main(String args[]){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println("El rectangulo tiene un area de  " + calcularArea(a, b));

    }
    private static int calcularArea (int a, int b){
        return a * b;
    }
}
