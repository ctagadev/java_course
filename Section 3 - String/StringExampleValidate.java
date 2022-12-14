package section3;

public class StringExampleValidate {
    public static void main(String[] args) {

        String course = null; // indicamos un valor nulo al string

        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);

        if (isNull) {
            course = "Java programming course";
        }
        boolean empty = course.length() == 0; // longitud igual a 0
        boolean empty2 = course.isEmpty(); // esta vació
        boolean empty3 = course.isBlank(); // es carácter blanco, por ejemplo, un espacio

        if(!empty) {
            System.out.println(course.toUpperCase());
            System.out.printf("Welcome to ".concat(course));
        }
        if(!empty2) {
            System.out.println(course.toUpperCase());
            System.out.printf("Welcome to ".concat(course));
        }
        if(!empty3) {
            System.out.println(course.toUpperCase());
            System.out.printf("Welcome to ".concat(course));
        }
    }
}