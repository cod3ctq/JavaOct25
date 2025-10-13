import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class EjercicioProfe {
    public static void main(String[] args) {
        //lectura/escritura de archivos con Java

        //Lectura
        String ruta = "C:\\Users\\Daniel\\Desktop\\archivo1.txt";
        String ruta2="C:\\Users\\Daniel\\Desktop\\archivo2.txt";
        File file = new File(ruta); //representacion de la ubicacione del archivo en memoria
        File file2 = new File(ruta2);
        String linea; //auxiliar
        int[] conteoVocales=new int[5];
        String vocales="aeiou";
        try {
            FileReader fr = new FileReader(file); //copia del contenido del archivo en memoria RAM
            BufferedReader br = new BufferedReader(fr); //lee el cache (fr)
            //mientras la linea tenga un contenido...

            while ((linea = br.readLine()) != null) {
                linea=linea.toLowerCase();
                for (int i=0;i<linea.length();i++){
                    if (vocales.indexOf(linea.charAt(i))>=0){
                        conteoVocales[vocales.indexOf(linea.charAt(i))]++;
                    }
                }
            }

            //Escritura
            FileWriter fw=new FileWriter(file2);
            fw.write(Arrays.toString(conteoVocales));

            fw.close();//si no lo cierras no se guarda lo que hayas escrito
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
