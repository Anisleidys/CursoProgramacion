public class Ejemplo03_03 {
    public static final int TEMP_FRIO = 15;

    public static void main(String[] args) {
        int temp = Integer.valueOf(args[0]);
        if (haceFrio(temp)) {
            ponerCalefaccion ();
            abrigarse();
        }
    }

    public static boolean haceFrio(int temp){
        return temp <= TEMP_FRIO;
    }

    public static void ponerCalefaccion(){
        System.out.println( "Calefaccion a tope!!");
    }

    public static void abrigarse(){
        System.out.println("Donde esta mi abrigo");
    }

}
