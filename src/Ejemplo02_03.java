public class Ejemplo02_03 {
    public static void main (String[] args){
        int numClientes=Integer.valueOf(args[0]);
        int numEmpleados=Integer.valueOf(args[1]);
        int numSillas=Integer.valueOf(args[2]);
        int numMesas=Integer.valueOf(args[3]);
        int numContratos=Integer.valueOf(args[4]);
        int numReclamaciones=Integer.valueOf(args[5]);

        int numPersonas= suma(numClientes, numEmpleados);
        int numMuebles=suma (numSillas,numMesas);
        int numExpedientes=suma(numContratos,numReclamaciones);

        System.out.println("Tenemos " + numPersonas + " personas " + numMuebles + " muebles y " + numExpedientes + " expedientes");
    }
    private static int suma(int a, int b){
        return a+b;



    }
}
