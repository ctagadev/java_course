<<<<<<< Updated upstream
=======
package section2;

>>>>>>> Stashed changes
public class NumericSystems {
    public static void main(String[] args) {

        int numberDecimal = 500;
        System.out.println("numberDecimal = " + numberDecimal);

        System.out.println("Binary " + numberDecimal + " = " + Integer.toBinaryString(numberDecimal)); //binary

        int numberBinary = 0b111110100; //0b --> binary
        System.out.println("numberBinary = " + numberBinary);

        System.out.println("Octal " + numberDecimal + " = " + Integer.toOctalString(numberDecimal)); //octal

        int numberOctal = 0764; //0 --> octal
        System.out.println("numberOctal = " + numberOctal);

        System.out.println("Hex " + numberDecimal + " = " + Integer.toHexString(numberDecimal)); //hex

        int numberHex = 0x1f4; //0x --> hex
        System.out.println("numberHex = " + numberHex);
    }
}
