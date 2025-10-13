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
        String ruta = "\"C:\\Users\\luiss\\Desktop\\Archivo1.txt\"";
        String ruta2 = "\"C:\\Users\\luiss\\Desktop\\Archivo 2.txt\"";

        File file = new File(ruta); // Representacion del archivo en memoria
        File File2 = new File(ruta2);
        String Linea; //auxiliar

        //contadores de vocales
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        try{
            FileReader fr = new FileReader(file);  //copia del contenido en memoria ram
            BufferedReader br = new BufferedReader(fr);//Lee el cache


            //Mientras la linea tenga algun contenido ...
            while ((Linea = br.readLine()) != null) {
                System.out.println(Linea);

                Linea =Linea.toLowerCase();

                for ( int i = 0; i < Linea.length(); i++){
                    char c =Linea.charAt(i);
                    switch (c){
                        case 'a': contadorA++; break;
                        case 'e': contadorE++; break;
                        case 'i': contadorI++; break;
                        case 'o': contadorO++; break;
                        case 'u': contadorU++; break;
                    }

                }

            }
            //Crear codigo para contar cuantas veces aparece cada una
            //de las vocales en todo el texto
            //Escribir el conteo de cada vocal en el archivo2



            br.close();
            fr.close();
            //Escritura
            FileWriter fw = new FileWriter(File2);
            fw.write("Conteo de vocales : \n");
            fw.write("A " + contadorA + "\n");
            fw.write("E" + contadorE + "\n");
            fw.write("I: " + contadorI + "\n");
            fw.write("O: " + contadorO + "\n");
            fw.write("U: " + contadorU + "\n");
            fw.close();//Si no lo cierras no se guardara lo que hayas escrito
            System.out.println("Conteo de vacales escrito en: " + ruta2);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}



