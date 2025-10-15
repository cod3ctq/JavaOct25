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
        String ruta="C:\\Users\\admin\\OneDrive\\Escritorio\\archivo1.txt";
        String ruta2="C:\\Users\\admin\\OneDrive\\Escritorio\\archivo2.txt";
        File file = new File(ruta);
        File file2 = new File(ruta2);
        String linea;
        int contadorA=0, contadorE=0, contadorI=0, contadorO=0, contadorU=0;


        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            //Mientras la linea tenga algun contenido ...
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String lineaMinusculas = linea.toLowerCase();
                for (int i=0; i<lineaMinusculas.length(); i++ ){
                    char caracter = lineaMinusculas.charAt(i);
                    switch (caracter){
                        case 'a':
                            contadorA++;
                            break;
                        case 'e':
                            contadorE++;
                            break;
                        case 'i':
                            contadorI++;
                            break;
                        case 'o':
                            contadorO++;
                            break;
                        case 'u':
                            contadorU++;
                            break;
                    }
                }
            }
            //Crear codigo para contar cuantas veces aparece cada una de las vocales
            //en todo el texto
            //Escribir el conteo de cada vocal en el archivo2

            //Escritura
            FileWriter fw = new FileWriter(file2);
            fw.write("Vocal a: " + contadorA + "\n");
            fw.write("Vocal e: " + contadorE + "\n");
            fw.write("Vocal i: " + contadorI + "\n");
            fw.write("Vocal o: " + contadorO + "\n");
            fw.write("Vocal u: " + contadorU + "\n");
            fw.close(); // si no lo cierras no se guarda lo que hayas escrito

        }catch(Exception ex){
                ex.printStackTrace();
            }
        }
}