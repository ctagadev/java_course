<<<<<<< Updated upstream
=======
package section2;

>>>>>>> Stashed changes
public class PrimitivesCharacters {
    public static void main(String[] args) {

        //character
        char characterLetter = 'a'; //letter
        System.out.println("characterLetter = " + characterLetter);

        char characterNumber = '2'; //number
        System.out.println("characterNumber = " + characterNumber);

        char characterUnicode = '\u0040'; //unicode
        System.out.println("characterUnicode = " + characterUnicode);

        char characterDecimal = 64; //decimal
        System.out.println("characterDecimal = " + characterDecimal);

        System.out.println("characterUnicode = characterDecimal --> " + (characterUnicode == characterDecimal));

        char characterSymbol = '@'; //symbol
        System.out.println("characterSymbol = " + characterSymbol);

        System.out.println("\n");

        System.out.println("Char:");
        System.out.println("Size " + Character.BYTES + " Bytes");
        System.out.println("Size " + Character.SIZE + " Bits");
        System.out.println("Maximum Value " + Character.MAX_VALUE);
        System.out.println("Minimum Value " + Character.MIN_VALUE);

        System.out.println("\n");

        char space = ' ';
        char spaceUnicode = '\u0020';

        char backlash = '\b';

        char tabulardor = '\t';

        char newLine = '\n';

        char carriageReturn = '\r';

        System.out.println("\n");

        //alternativa \n and \r
        System.out.println("Line" + System.getProperty("line.separator") + "Separator alternative 1");
        System.out.println("Line" + System.lineSeparator() + "Separator alternative 2");
    }
}
