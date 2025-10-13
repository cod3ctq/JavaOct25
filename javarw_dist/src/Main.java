import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //lectura/escritura de archivos con Java

        //Lectura
        String ruta = "C:\\Users\\Daniel\\Desktop\\archivo1.txt";
        String ruta2="C:\\Users\\Daniel\\Desktop\\archivo2.txt";
        File file = new File(ruta); //representacion de la ubicacione del archivo en memoria
        File file2 = new File(ruta2);
        String linea; //auxiliar
        int contA=0; int contE=0; int contI=0; int contO=0; int contU=0;
        try {
            FileReader fr = new FileReader(file); //copia del contenido del archivo en memoria RAM
            BufferedReader br = new BufferedReader(fr); //lee el cache (fr)
            //mientras la linea tenga un contenido...

            while ((linea = br.readLine()) != null) {
                linea=linea.toLowerCase();
                for (int i=0;i<linea.length();i++){
                    if (linea.charAt(i)=='a' || linea.charAt(i)=='á'){
                        contA++;
                    } else if (linea.charAt(i)=='e' || linea.charAt(i)=='é') {
                        contE++;
                    } else if (linea.charAt(i)=='i' || linea.charAt(i)=='í') {
                        contI++;
                    } else if (linea.charAt(i)=='o' || linea.charAt(i)=='ó') {
                        contO++;
                    } else if(linea.charAt(i)=='u' || linea.charAt(i)=='ú'){
                        contU++;
                    }
                }
            }

            //Escritura
            FileWriter fw=new FileWriter(file2);
            fw.write("Inclui vocales con acento y mayusculas:\n");
            fw.write("Numero total de a: "+contA+"\n");
            fw.write("Numero total de e: "+contE+"\n");
            fw.write("Numero total de i: "+contI+"\n");
            fw.write("Numero total de o: "+contO+"\n");
            fw.write("Numero total de u: "+contU+"\n");
            fw.close();//si no lo cierras no se guarda lo que hayas escrito
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}