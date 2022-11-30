public class TypeConversion {
    public static void main(String[] args) {
        //String to int
        String numberStr = "50";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numberInt = " + numberInt);

        //String to double
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //String to boolean
        String logicStr = "true";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);

        System.out.println("\n");

        //var to int
        var numberVar = "50";
        var numberVarInt = Integer.parseInt(numberVar);
        System.out.println("numberVarInt = " + numberVarInt);

        //var to double
        var realVar = "98765.43e-3";
        var realVarDouble = Double.parseDouble(realVar);
        System.out.println("realVarStr = " + realVarDouble);

        //String to boolean
        var logicVar = "true";
        boolean logicVarBoolean = Boolean.parseBoolean(logicVar);
        System.out.println("logicVar = " + logicVarBoolean);

        System.out.println("\n");

        //int to String
        int numberInt2 = 100;
        String numberStr2 = Integer.toString(numberInt2);
        System.out.println("numberStr2 = " + numberStr2);

        //int to String 2
        numberStr2 = String.valueOf(numberInt2);
        System.out.println("numberStr2.2 = " + numberStr2);

        //real to String
        double realDouble2 = 1.23456e2;
        String realStr2 = Double.toString(realDouble2);
        System.out.println("realStr2 = " + realStr2);

        //real to String 2
        realStr2 = String.valueOf(realDouble2);
        System.out.println("realStr2.2 = " + realStr2);
    }
}
