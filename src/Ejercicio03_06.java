public class Ejercicio03_06 {
    public static void main(String[] args){
        int a = -3;
        int b = -8;
        int c = 4;
        int d = 6;
        System.out.println( valorX(a,b,c,d));
    }
    public static int valorX(int a, int b, int c, int d){
        int x = (a < 0 ? a : -a ) * (b > c ? b : d > c ? c : d);
        return x;
    }
}
