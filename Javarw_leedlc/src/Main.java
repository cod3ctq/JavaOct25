import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        //lectura/escritura de archivos con java

        //lectura

        String ruta = "C:\\Users\\luisw\\Desktop\\codigo.txt";
        String ruta2 = "C:\\Users\\luisw\\Desktop\\Archivo2.txt";
        File file = new File(ruta);//.representacion del archivo en memoria
        File file2 = new File(ruta2);
        String linea;//variable auxiliar
/*
        try {
            FileReader fr = new FileReader(file);//copia del contenido del archivo en memoria ram
            BufferedReader br = new BufferedReader(fr);//lee el cache

            //mientras la linea tenga algun contenido ...
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */

        try {
            FileReader fr = new FileReader(file);//copia del contenido del archivo en memoria ram
            BufferedReader br = new BufferedReader(fr);//lee el cache

            //mientras la linea tenga algun contenido ...
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            //Excritura
            FileWriter fw = new FileWriter(file2);
            fw.write("HOLA JAVA DESDE EL CODIGO");
            fw.close();//si no lo cierras no se guarda lo que hayas escrito

            //crear un codigo para contar cuantas veces aparece cada una de las vocales
            //en todo el texot.
            //Escribie el conteo de cada vocal en el archivo2

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
