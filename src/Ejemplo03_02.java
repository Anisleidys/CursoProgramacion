public class Ejemplo03_02 {
    public static void main(String[] args){
        int temp = Integer.valueOf(args[0]);

        if(temp > 0){
           System.out.println(temp + "°C positivos");
        } else if (temp == 0) {
                System.out.println(temp + "°C ni frio, ni calor ");
            }
            else{
                System.out.println(temp + "°C negativos");
            }
        }
        //if(haceFrio(temp)) {
           // ponerCalefaccion();
           // abrigarse();
       // }


    }

   // private static boolean haceFrio (int temp){
        //return temp <= 15;
    //}
    //private static void ponerCalefaccion(){
       // System.out.println("calefaccion a tope!!");
   // }
    //private static void abrigarse(){
        //System.out.println("Donde esta mi abrigo");
    //}


