import java.io.*;
import java.nio.Buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lectura/escritura de archivos con Java

        //Lectura
        String ruta="C:\\Users\\ivanp\\Desktop\\archivo1.txt";
        String ruta2 = "C:\\Users\\ivanp\\Desktop\\archivo2.txt";
        File file = new File(ruta); //Representacion del archivo en memoria
        File file2= new File(ruta2);
        String linea; //auxiliar
        //ruta = ruta.toLowerCase();

        int contarA = 0;
        int contarE = 0;
        int contarI = 0;
        int contarO = 0;
        int contarU = 0;


        try{
            FileReader fr = new FileReader(file); //copia del contenido en memoria ram
            BufferedReader br = new BufferedReader(fr); //Lee el cache
            //Mientras la linea tenga algun contenido ...
            while( (linea=br.readLine()) != null){
                System.out.println(linea);
                linea = linea.toLowerCase();

                for (int i=0; i < linea.length(); i++){
                    char c = linea.charAt(i);

                    if (c == 'a'){
                        contarA++;

                    } else if (c == 'e') {
                        contarE++;

                    } else if (c == 'i') {
                        contarI++;

                    } else if (c == 'o') {
                        contarO++;

                    } else if (c == 'u') {
                        contarU++;

                    }

                }






            }

            //Crear codigo para contar cuantas veces aparece cada vocal en tdo el texto
            //Escribir el conteo de cada voal en el archivo2



            //imprimimos






            //Escritura
            FileWriter fw = new FileWriter(file2);


            fw.write(" El conteo de vocales es: \n ");
            fw.write(" A: " +contarA+ "\n");
            fw.write(" E: " +contarE+ "\n");
            fw.write(" I: " +contarI+ "\n");
            fw.write(" O: " +contarO+ "\n");
            fw.write(" U: " +contarU+ "\n");
            fw.close(); //Si no lo cierras, no se guarda lo que se escribe





        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}