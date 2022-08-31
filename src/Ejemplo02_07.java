public class Ejemplo02_07 {
    public static void main ( String[] args){
        System.out.println("1) AND: " + (siemprecierto() && siemprefalso ()));
        System.out.println("2) AND: " + (siemprefalso() && siemprecierto ()));
        System.out.println("3) OR: " + (siemprecierto() || siemprefalso ()));
        System.out.println("4) OR: " + (siemprefalso() || siemprecierto ()));

    }
    private static boolean siemprecierto() {
        System.out.println("siemprecierto");
        return true;
    }
    private static boolean siemprefalso(){
        System.out.println("siemprefalso");
        return false;
    }



}
