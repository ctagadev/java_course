package section3;

import javax.lang.model.SourceVersion;

public class StringExampleMethods {
    public static void main(String[] args) {
        
        String name = "César";

        System.out.println("name.length() = " + name.length()); // largo de la cadena
        System.out.println("name.toUpperCase = " + name.toUpperCase()); // mayúsculas
        System.out.println("name.toLowerCase() = " + name.toLowerCase()); // minúsculas
        System.out.println("name.equals(\"César\") = " + name.equals("César")); //comparar string true
        System.out.println("name.equals(\"césar\") = " + name.equals("césar")); //comparar string false
        System.out.println("name.equalsIgnoreCase(\"césar\") = " + name.equalsIgnoreCase("césar")); //compara string IgnoreCase
        System.out.println("name.compareTo(\"\") = " + name.compareTo("César")); //comparando por UNICODE salida int
        System.out.println("name.compareTo(\"Luis\") = " + name.compareTo("Luis")); //comparando por UNICODE salida int
        System.out.println("name.charAt() = " + name.charAt(0)); //convertir a char el string (posición)
        System.out.println("name.charAt(name.length()-1 = " + name.charAt(name.length()-1)); //convertir a char el último con length, se resta 1 porque el resultado lo da en entero humano 6
        System.out.println("name.substring(1) = " + name.substring(1)); //salida de parte del string (posición del carácter)
        System.out.println("name.substring(1,4) = " + name.substring(1,4)); //salida de parte del string (posición inicial, posición final no incluida)
        System.out.println("name.substring(name.length()-1) = " + name.substring(name.length()-1)); //salida de parte del string (variable length) -1, ya que length saca salida a entero humano 6

        System.out.println();
        String tongueTwisters = "Tongue Twisters";
        
        System.out.println("tongueTwisters = " + tongueTwisters);
        System.out.println("tongueTwisters = " + tongueTwisters.replace("t", ".")); //reemplazar carácter por otro
        System.out.println("tongueTwisters.indexOf('s') = " + tongueTwisters.indexOf('s')); //buscar un char/string dentro del string, primera posición encontrada
        System.out.println("tongueTwisters.lastIndexOf('s') = " + tongueTwisters.lastIndexOf('s')); //busca un char/string dentro del string, pero la última encontrada
        System.out.println("tongueTwisters.indexOf('z') = " + tongueTwisters.indexOf('z')); //si no encuentra el valor, retorna -1
        System.out.println("tongueTwisters.contains(\"z\") = " + tongueTwisters.contains("z")); //buscar valor, retorna un boolean
        System.out.println("tongueTwisters.startsWith(\"Twisters\") = " + tongueTwisters.startsWith("Twisters")); //busca si comienza con el valor indicado, resultado boolean
        System.out.println("tongueTwisters.endsWith(\"rs\") = " + tongueTwisters.endsWith("rs")); //busca si termina con el valor indicado, resultado boolean

        System.out.println();

        System.out.println("  Tongue  Twisters  ");
        System.out.println("  Tongue  Twisters  ".trim()); //quita los espacios en blanco inicial y final
    }
}
