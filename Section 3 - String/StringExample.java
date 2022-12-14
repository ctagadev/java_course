package section3;

public class StringExample {
    public static void main(String[] args) {
        String course = "Java programming";
        String course2 = new String("java programming");

        //compare string type
        boolean equals = course == course2;
        System.out.println("equals = " + equals);

        //compare string content
        boolean equals2 = course.equals(course2);
        System.out.println("equals2 = " + equals2);

        //compare string content (ignore case)
        boolean equals3 = course.equalsIgnoreCase(course2);
        System.out.println("equals3 = " + equals3);

    }
}
