import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lectura/escritura de archivos con Java

        //Lectura

        String ruta = "C:\\Users\\benit\\OneDrive\\Escritorio\\Nuevo Documento de texto.txt";
        String ruta2 = "C:\\Users\\benit\\OneDrive\\Escritorio\\archivo2.txt";
        File file = new File(ruta); //Representacion del archivo en memoria
        File file2 = new File(ruta2);
        String linea; //Auxiliar
        int a = 0, e = 0, i = 0, o = 0, u = 0;
//        int[] conteoVocales = new int[5];
        try {
            FileReader fr = new FileReader(file); //copia del contenido en memoria ram
            BufferedReader br = new BufferedReader(fr); //Lee el cache
            //mientras la linea tenga algun contenido

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                linea=linea.toLowerCase();

                for (int k = 0; k < linea.length(); k++) {
                    char c = linea.charAt(k);
                    switch (c) {
                        case 'a':
                            a++;
                            break;
                        case 'e':
                            e++;
                            break;
                        case 'i':
                            i++;
                            break;
                        case 'o':
                            o++;
                            break;
                        case 'u':
                            u++;
                            break;
                        default:
                            //No hace algo
                    }
                }
            }

            //Crear codigo para contar cuantas veces aparece cada una
            //de las vocales en todo el texto
            //Escribir el conteo de cada vocal en el archivo2

//            br.readLine().toLowerCase();



            //Escritura
            FileWriter fw = new FileWriter(file2);
            fw.write("a=" + a + " e=" + e + " i=" + i + " o=" + o + " u=" + u);
            fw.close();//Si no lo cierras, no se guarda lo que hayas escrito

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}