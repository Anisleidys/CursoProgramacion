public class Ejercicios02_0 {
    public static void main (String [] args) {
        //int uno = 1;
        //int res = suma(uno, suma(uno + uno, suma(-1, uno * uno)));
        //System.out.println(res);


        //private static int suma(int a , int b){
            //return a + b;
        int a = 4;
        int b = 8;
        int c = 2;
        System.out.println( "El resultado es " + res(a, b, c));
        }


        private static boolean res(int a, int b, int c){
        return c >= (b/a) || (a*b) - c < 0;

        }
}

