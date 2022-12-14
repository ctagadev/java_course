package section3;

public class StringExampleConcatPerformanceTest {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 500; i++){
            // c = c.concat(a).concat(b).concat("\n"); //500 -> 2ms
            // c += a + b + "\n"; //500 -> 19ms
            sb.append(a).append(b).append("\n"); //500 -> 0ms
        }

        long end = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println(end - start);

    }
}
