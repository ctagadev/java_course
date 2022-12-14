<<<<<<< Updated upstream
=======
package section2;

>>>>>>> Stashed changes
import javax.swing.*;

public class NumericSystemGui2 {
    public static void main(String[] args) {

        String numberStr = JOptionPane.showInputDialog(null, "Enter a number"); // GUI
        int numberDecimal = Integer.parseInt(numberStr); // String to int
        System.out.println("numberDecimal = " + numberDecimal);

        String resultBinary = "Binary " + numberDecimal + " = " + Integer.toBinaryString(numberDecimal);
        System.out.println(resultBinary); //binary

        String resultOctal = "Octal " + numberDecimal + " = " + Integer.toOctalString(numberDecimal);
        System.out.println(resultOctal); //octal

        String resultHex = "Hex " + numberDecimal + " = " + Integer.toHexString(numberDecimal);
        System.out.println(resultHex); //hex


        String message = resultBinary;
        message += "\n" + resultOctal;
        message += "\n" + resultHex;
        JOptionPane.showMessageDialog(null, message);
    }
}