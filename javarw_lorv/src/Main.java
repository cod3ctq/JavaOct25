import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String ruta  = "C:\\Users\\luisoccera\\Desktop\\archivo1.txt";
        String ruta2 = "C:\\Users\\luisoccera\\Desktop\\archivo2.txt";
        File file  = new File(ruta);
        File file2 = new File(ruta2);

        int ca = 0, ce = 0, ci = 0, co = 0, cu = 0;

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String s = linea.toLowerCase();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == 'a') ca++;
                    else if (c == 'e') ce++;
                    else if (c == 'i') ci++;
                    else if (c == 'o') co++;
                    else if (c == 'u') cu++;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }

        try (FileWriter fw = new FileWriter(file2)) {
            fw.write("Conteo de vocales del archivo:\n");
            fw.write("a: " + ca + "\n");
            fw.write("e: " + ce + "\n");
            fw.write("i: " + ci + "\n");
            fw.write("o: " + co + "\n");
            fw.write("u: " + cu + "\n");
            fw.write("TOTAL: " + (ca + ce + ci + co + cu) + "\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
