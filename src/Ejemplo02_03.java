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

       int respuesta = suma(3,4);

        System.out.println( "La respuesta es " + respuesta);

        int numClientesJuan = 2;
        int numClienteMaria = 3;
        //int Total= suma(numClientesJuan, numClienteMaria);
        System.out.println("Juan y Maria son " + suma(numClientesJuan, numClienteMaria));

        suma(3,suma(numClientesJuan, numClienteMaria));
        System.out.println("Resultado de la suma combinada es " + suma(3,suma(numClientesJuan, numClienteMaria)));

        int b= suma(numClientesJuan, numClienteMaria);
        int a= suma(3,b);
        int x = sumaMas5(5, 10 );

        int resultado = suma( a, suma(b,x));
        System.out.println("Resultado " +resultado);






    }
    private static int suma(int a, int b){
        return a+b;

    }

    private static int sumaMas5(int a, int b){
        int c=5;
        return a + b + c;

    }

}
