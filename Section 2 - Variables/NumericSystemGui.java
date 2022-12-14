<<<<<<< Updated upstream
=======
package section2;

>>>>>>> Stashed changes
import javax.swing.*;

public class NumericSystemGui {
    public static void main(String[] args) {

        String numberStr = JOptionPane.showInputDialog(null, "Enter a number"); // GUI
        int numberDecimal = Integer.parseInt(numberStr); // String to int
        System.out.println("numberDecimal = " + numberDecimal);

        System.out.println("Binary " + numberDecimal + " = " + Integer.toBinaryString(numberDecimal)); //binary
        System.out.println("Octal " + numberDecimal + " = " + Integer.toOctalString(numberDecimal)); //octal
        System.out.println("Hex " + numberDecimal + " = " + Integer.toHexString(numberDecimal)); //hex

        String message = "Binary " + numberDecimal + " = " + Integer.toBinaryString(numberDecimal);
        message += "\nOctal " + numberDecimal + " = " + Integer.toOctalString(numberDecimal);
        message += "\nHex " + numberDecimal + " = " + Integer.toHexString(numberDecimal);
        JOptionPane.showMessageDialog(null, message);
    }
}
