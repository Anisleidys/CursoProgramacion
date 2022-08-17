public class Ejemplo02_02 {
    public static void main(String[] args){
        int numManzanas= Integer.valueOf(args[0]);
        int numPeras= Integer.valueOf(args[1]);
        int numFrutas= numManzanas+numPeras;
        System.out.println("El frutero tiene " + numFrutas + " piezas de fruta.");


    }
}
