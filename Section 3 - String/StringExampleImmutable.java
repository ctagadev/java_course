package section3;

public class StringExampleImmutable {
    public static void main(String[] args) {
        String course = "Java programming";
        String teacher = "Fulanito";

        //concatenation
        String result = course.concat(teacher);
        System.out.println("result = " + result);
        System.out.println(course == result);

        //transform
        String result2 = course.transform(c -> {
            return c + " with " + teacher;
        });
        System.out.println("result2 = " + result2);

        //replace
        String result3 = result.replace("a", "A");
        System.out.println("result3 = " + result3);
    }
}
