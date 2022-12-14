package section3;

public class StringExampleMethodsArray {
    public static void main(String[] args) {
        
        String tongueTwisters = "TongueTwisters";

        System.out.println("tongueTwisters.toCharArray() = " + tongueTwisters.toCharArray()); //salida tipo HASH

        //salida tipo char
        char[] array = tongueTwisters.toCharArray();
        int length = array.length;
        for(int i = 0; i < length; i++) {
            System.out.println("arrengement[i] = " + array[i]);
        }

        System.out.println("tongueTwisters.split(\"a\") = " + tongueTwisters.split("e")); //split divide el string por el carácter indicado, salida tipo HASH

        //salida tipo string
        System.out.println();
        String[] array2 = tongueTwisters.split("e");
        int l = array2.length;
        for(int j = 0; j < l; j++) {
            System.out.println(array2[j]);
        }

        //misma forma tipo string, pero usando formato archivo
        System.out.println();
        String file = "algún.archivo.jpg";
        String[] fileArr = file.split("\\."); //punto es un carácter reservado, usamos \\ para indicarle que es un carácter simple, también podemos usar []
        int m = fileArr.length;
        for(int k = 0; k < m; k++) {
            System.out.println(fileArr[k]);
        }

        //sacar solo el final, extensión del archivo
        System.out.println();
        System.out.println("fileArr[m-1] = " + fileArr[m-1]);
    }
}
