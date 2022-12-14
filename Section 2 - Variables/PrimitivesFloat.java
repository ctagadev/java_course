<<<<<<< Updated upstream
=======
package section2;

>>>>>>> Stashed changes
public class PrimitivesFloat {
    public static void main(String[] args) {

        //float
        float realFloat = 1.0f;
        System.out.println("realFloat = " + realFloat);

        System.out.println("\n");

        // float exponential
        float realFloatExp = 1.5e4f;
        System.out.println("realFloatExp = " + realFloatExp);

        System.out.println("\n");

        // float exponential negative
        float realFloatExpNeg = 1.5e-4f;
        System.out.println("realFloatExpNeg = " + realFloatExpNeg);

        System.out.println("\n");

        System.out.println("Float:");
        System.out.println("Size " + Float.BYTES + " Bytes");
        System.out.println("Size " + Float.SIZE + " Bits");
        System.out.println("Maximum Value " + Float.MAX_VALUE);
        System.out.println("Minimum Value " + Float.MIN_VALUE);

        System.out.println("\n");
        
        //double
        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Size " + Double.BYTES + " Bytes");
        System.out.println("Size " + Double.SIZE + " Bits");
        System.out.println("Maximum Value " + Double.MAX_VALUE);
        System.out.println("Minimum Value " + Double.MIN_VALUE);

        System.out.println("\n");

        var varDouble = 3.1416; //double
        System.out.println("varDouble = " + varDouble);

        System.out.println("\n");

        var varFloat = 3.1416f; //float
        System.out.println("varFloat = " + varFloat);

    }
}
