import java.util.Scanner;

public class NumericSystemConsole {
    public static void main(String[] args) {
        //console version
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String numberStr = scanner.nextLine();

        int numberDecimal = 0; //start int
        //error control
        try {
            numberDecimal = Integer.parseInt(numberStr); // String to int
        } catch (NumberFormatException e){
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
