import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Lectura y escritura de archivos con Java
public class Main {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\DELL\\Desktop\\archivo1.txt"; // Archivo origen
        String ruta2 = "C:\\Users\\DELL\\Desktop\\archivo2.txt"; // Archivo destino

        File file = new File(ruta);
        File file2 = new File(ruta2);
        String linea; // auxiliar

        // Contadores de vocales
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        try {
            // lectura
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) { //leer linea por linea
                System.out.println(linea);

                // convert línea a minusculas
                linea = linea.toLowerCase();

                // recorrer la linea caracter por caracter
                for (int i = 0; i < linea.length(); i++) {
                    char c = linea.charAt(i);
                    switch (c) {
                        case 'a':
                            contA++;
                            break;
                        case 'e':
                            contE++;
                            break;
                        case 'i':
                            contI++;
                            break;
                        case 'o':
                            contO++;
                            break;
                        case 'u':
                            contU++;
                            break;
                    }
                }
            }

            br.close();
            fr.close();

            // Escritura del resultado en archivo2
            FileWriter fw = new FileWriter(file2);
            fw.write("Conteo de vocales:\n");
            fw.write("A: " + contA + "\n");
            fw.write("E: " + contE + "\n");
            fw.write("I: " + contI + "\n");
            fw.write("O: " + contO + "\n");
            fw.write("U: " + contU + "\n");

            fw.close();

            System.out.println("\nConteo completado. Revisa el archivo2.txt");

        } catch (IOException ex) { // excepcion solo input output
            ex.printStackTrace();
        }
    }
}







