import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] vocales = {"a", "e", "i", "o", "u","á", "é", "í", "ó", "ú"};
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        String ruta = "C:\\Users\\luisw\\Desktop\\codigo.txt";
        String ruta2 = "C:\\Users\\luisw\\Desktop\\Archivo2.txt";
        File file = new File(ruta);//.representacion del archivo en memoria
        File file2 = new File(ruta2);
        String linea;//variable auxiliar
        StringBuilder texto = new StringBuilder();

        try {
            FileReader fr = new FileReader(file);//copia del contenido del archivo en memoria ram
            BufferedReader br = new BufferedReader(fr);//lee el cache

            //mientras la linea tenga algun contenido ...
            while ((linea = br.readLine()) != null) {
                // System.out.println(linea);
                texto.append(linea);
            }
            //fr.close();
            //br.close();
            char[] caracteresT = texto.toString().toLowerCase().toCharArray();

            System.out.println(texto);
            for (String vocale : vocales) {
                for (char c : caracteresT) {
                    if (vocale.equalsIgnoreCase(String.valueOf(c))) {
                        if (c == 'a' || c == 'á') {
                            contA++;
                        } else if (c == 'e' || c == 'é') {
                            contE++;
                        } else if (c == 'i' || c == 'í') {
                            contI++;
                        } else if (c == 'o' || c == 'ó') {
                            contO++;
                        } else if (c == 'u' || c == 'ú') {
                            contU++;
                        }
                    }
                }
            }
            System.out.println("a aparecio " + contA);
            System.out.println("e aparecio " + contE);
            System.out.println("i aparecio " + contI);
            System.out.println("o aparecio " + contO);
            System.out.println("u aparecio " + contU);

            FileWriter fw = new FileWriter(file2);
            fw.write("a aparecio " + contA+"\ne aparecio " + contE+"\ni aparecio " + contI
                    +"\no aparecio " + contO+"\nu aparecio " + contU);
            fw.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
