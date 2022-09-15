public class Ejemplo03_04 {
    private static String figura;

    public static void main(String[] args){
        int numLados=3;
        switch (numLados){
            case 3:
                figura = "triangulo";
                break;
            case 4:
                figura = "cuadrado";
                break;
            case 5:
                figura = "pentagono";
                break;
            default:
                figura = "este no me lo se ;)";
        }
    }
}
