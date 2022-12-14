<<<<<<< Updated upstream
=======
package section2;

>>>>>>> Stashed changes
public class PrimitivesIntegers {
    public static void main(String[] args) {

        //byte -128 to 127
        byte numberByte = 33;
        System.out.println("numberByte = " + numberByte);
        System.out.println("Size " + Byte.BYTES + " Byte");
        System.out.println("Size " + Byte.SIZE + " Bits");
        System.out.println("Maximum Value " + Byte.MAX_VALUE);
        System.out.println("Minimum Value " + Byte.MIN_VALUE);

        System.out.println("\n" );

        //short -32768 to 32767
        short numberShort = 32767;
        System.out.println("numberShort = " + numberShort);
        System.out.println("Size " + Short.BYTES + " Bytes");
        System.out.println("Size " + Short.SIZE + " Bits");
        System.out.println("Maximum Value " + Short.MAX_VALUE);
        System.out.println("Minimum Value " + Short.MIN_VALUE);

        System.out.println("\n" );

        //int -2147483648 to 2147483647
        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);
        System.out.println("Size " + Integer.BYTES + " Bytes");
        System.out.println("Size " + Integer.SIZE + " Bits");
        System.out.println("Maximum Value " + Integer.MAX_VALUE);
        System.out.println("Minimum Value " + Integer.MIN_VALUE);

        System.out.println("\n" );

        //long -9223372036854775808 to 9223372036854775807
        long numberLong = 9223372036854775807L;
        System.out.println("numberLong = " + numberLong);
        System.out.println("Size " + Long.BYTES + " Bytes");
        System.out.println("Size " + Long.SIZE + " Bits");
        System.out.println("Maximum Value " + Long.MAX_VALUE);
        System.out.println("Minimum Value " + Long.MIN_VALUE);

        System.out.println("\n" );

        //var (JDK10+) dynamic
        var numberVarByte = 127; //byte
        var numberVarShort = 32767; //short
        var numberVarInt = 2147483647; //int
        var numberVarLong = 9223372036854775807L; //long
        System.out.println("numberVarByte = " + numberVarByte);
        System.out.println("numberVarShort = " + numberVarShort);
        System.out.println("numberVarInt = " + numberVarInt);
        System.out.println("numberVarLong = " + numberVarLong);
    }
}