<<<<<<< Updated upstream
=======
package section2;

>>>>>>> Stashed changes
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericSystemConsole2 {
    public static void main(String[] args) {
        //console version
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        //String numberStr = scanner.nextLine();

        int numberDecimal = 0; //start int
        //error control
        try {
            numberDecimal = scanner.nextInt(); // String to int
        } catch (InputMismatchException e){
            System.out.println("ERROR: you must enter an integer");
            main(args);
            System.exit(0);
        }
        //console exit
        System.out.println("numberDecimal = " + numberDecimal);
        String resultBinary = "Binary " + numberDecimal + " = " + Integer.toBinaryString(numberDecimal);
        String resultOctal = "Octal " + numberDecimal + " = " + Integer.toOctalString(numberDecimal);
        String resultHex = "Hex " + numberDecimal + " = " + Integer.toHexString(numberDecimal);

        String message = resultBinary;
        message += "\n" + resultOctal;
        message += "\n" + resultHex;
        System.out.println(message);
    }
}
