import java.io.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lectura/escritura de archivos con Java

        //Lectura
        String ruta="C:\\Users\\Cesar\\Desktop\\archivo1.txt";
        String ruta2 = "C:\\Users\\Cesar\\Desktop\\archivo2.txt";
        File file = new File(ruta); //Representacion del archivo en memoria
        File file2 = new File(ruta2);
        String linea; //auxiliar
        //0=a, 1=e, 2=i
        int[] conteoVocales = new int[5];
        String vocales="aeiou";
        try{
            FileReader fr = new FileReader(file); //copia del contenido en memoria ram
            BufferedReader br = new BufferedReader(fr); //Lee el cache
            //Mientras la linea tenga algun contenido ...
            while( (linea=br.readLine()) != null){
                System.out.println(linea);
                linea = linea.toLowerCase();
                for(int i =0; i<linea.length(); i++){
                    if(vocales.indexOf(linea.charAt(i))>=0){
                        conteoVocales[vocales.indexOf(linea.charAt(i))]++;
                    }
                }
            }
            //Crear codigo para contar cuantas veces aparece cada una de las vocales
            //en todo el texto.
            //Escritura
            FileWriter fw = new FileWriter(file2);
            fw.write("HOY HABRA EXAMEN DE LA SEMANA 1");
            fw.close(); //Si no lo cierras, no se guarda lo que hayas escrito

            System.out.println(Arrays.toString(conteoVocales));

        }catch(Exception ex){ //De entrada, usar el generico de todas las excepciones
            ex.printStackTrace();
        }
    }
}