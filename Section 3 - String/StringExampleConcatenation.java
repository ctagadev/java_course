package section3;

import javax.swing.*;

public class StringExampleConcatenation {
    public static void main(String[] args) {
        String course = "Java programming";
        String teacher = "Fulanito";

        String detail = course + " with " + teacher;
        System.out.println(detail);

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + " " + numberA + numberB); //string + string + string
        System.out.println(detail + " " + (numberA + numberB)); //string + (int + int)

        System.out.println(numberA + numberB + " " + detail); //int + int + string

        String detail2 = course.concat(teacher);
        System.out.println("detail2 = " + detail2);

        String detail3 = course.concat(" with ".concat(teacher));
        System.out.println("detail3 = " + detail3);

        String detail4 = course.concat(" with ").concat(teacher);
        System.out.println("detail4 = " + detail4);

    }
}
