public class PrimitivesBoolean {
    public static void main(String[] args) {

        boolean dataLogical1 = false;
        boolean dataLogical2 = Boolean.FALSE; //not normally used
        System.out.println("dataLogical1 = " + dataLogical1);
        System.out.println("dataLogical2 = " + dataLogical2);

        System.out.println("\n");

        double d = 98723.45e-3;
        float f = 1.2345e2f;
        System.out.println("d = " + d);
        System.out.println("f = " + f);

        System.out.println("\n");

        dataLogical1 = d < f; //compare < true/false
        System.out.println("dataLogical1 = " + dataLogical1);

        System.out.println("\n");

        boolean same = 3-2 == 1;
        System.out.println("same = " + same);;
    }
}
