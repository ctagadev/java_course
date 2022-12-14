package section3;

public class StringExampleFileExtension {
    public static void main(String[] args) {
        
        String file = "algún_archivo.jpg";
        int i = file.indexOf("."); //indicamos desde donde queremos que lea, en este caso el . de la extensión
        System.out.println("file.length() = " + file.length()); //longitud del string
        System.out.println("file.substring(file.length()-3) = " + file.substring(file.length()-3)); //"dinámico" ya que la extensión tiene 3 caracteres, pero si tiene más o menos, no nos sirve
        System.out.println("file.substring(i) = " + file.substring(i)); //aquí podemos indicarle que lea desde el punto
        System.out.println("file.substring(i+1) = " + file.substring(i+1)); // +1 para que ignore el punto

        System.out.println("\n");
        //si tenemos dos puntos en el string, la salida no es correcta, ya que detecta el primer punto
        String file2 = "algún.archivo.jpg";
        int j = file2.indexOf(".");
        System.out.println("file2.substring(j+1) = " + file2.substring(j+1));

        System.out.println("\n");
        //arreglo para dos puntos en el mismo string
        String file3 = "algún.archivo.jpg";
        int k = file3.lastIndexOf("."); //aquí usamos lastIndexOf para indicar que sea el último valor que detecte
        System.out.println("file2.substring(k+1) = " + file2.substring(k+1));
    }
}
