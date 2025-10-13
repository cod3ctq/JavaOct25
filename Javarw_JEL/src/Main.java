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
        String ruta="C:\\Users\\Efren\\OneDrive\\Desktop\\archivo1.txt";
        String ruta2="C:\\Users\\Efren\\OneDrive\\Desktop\\archivo2.txt";
        File file = new File(ruta); //Representacion del archivo en memoria
        File file2 = new File(ruta2);
        String linea; //auxiliar


        try{
            FileReader fr = new FileReader(file); //copia del contenido en memoria ram
            BufferedReader br = new BufferedReader(fr); //Lee el cache

            int contA = 0;
            int contE = 0;
            int contI = 0;
            int contO = 0;
            int contU = 0;



            //Mientras la linea tenga algun contenido ...
            while( (linea=br.readLine()) != null){
                System.out.println(linea);
                linea = linea.toLowerCase();

                for(int i=0; i<linea.length(); i++){

                    char c = linea.charAt(i);
                    switch(c){
                        case 'a': contA++; break;
                        case 'e': contE++; break;
                        case 'i': contI++; break;
                        case 'o': contO++; break;
                        case 'u': contU++; break;
                        case 'á': contA++; break;
                        case 'é': contE++; break;
                        case 'í': contI++; break;
                        case 'ó': contO++; break;
                        case 'ú': contU++; break;
                    }
                }
            }


            //Crear un codigo para contar cuantas veces aparece cada una de las vocales
            //en todo el texto
            //Escribir el conteo de cada vocal en el archivo2

            //Escritura
            FileWriter fw = new FileWriter(file2);

            fw.write("Vocal A: " + contA + "\n");
            fw.write("Vocal E: " + contE + "\n");
            fw.write("Vocal I: " + contI + "\n");
            fw.write("Vocal O: " + contO + "\n");
            fw.write("Vocal U: " + contU + "\n");
            fw.close();// Si no se cierra no se guarda lo que se haya escrito

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}