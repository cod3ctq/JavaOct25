import java.io.*;
import java.util.Map;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// lectura o escrituta de archivos con java
// lectura

        String ruta="C:\\Users\\tachi\\Desktop\\Archivo 1.txt";
        File file= new File(ruta); // representacion del archivo en memorio
        String ruta2="C:\\Users\\tachi\\Desktop\\Archivo 2.txt";
        String linea;// auxiliar
        File file2 = new File(ruta2);
        Map<Character, Integer> conteoVocales = new HashMap<>();
        for (char vocal : new char[]{'a', 'e', 'i', 'o', 'u'}) {
            conteoVocales.put(vocal, 0);

        try{

            FileReader fr= new FileReader(file);  //copia del contenido del archivo en memoria ram
            BufferedReader br= new BufferedReader(fr); // lee el catche

            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }


// Crear codigo para contar cuantas veces aparece cada vocal en todo el texto
            // Escribit el conteo de cada vocal en el archivo 2
            //Escritura
            FileWriter fw= new FileWriter(file2);

            fw.write("Hoy habra examen de la semana 1");
            fw.close();// si no lo cierras no se guarda lo que hayas escrito

        } catch (Exception ex){
            ex.printStackTrace();
        }
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta2))) {
                for (char vocal : conteoVocales.keySet()) {
                    escritor.write("Vocal '" + vocal + "': " + conteoVocales.get(vocal));
                    escritor.newLine();
                }
                System.out.println("Conteo de vocales escrito correctamente en " + ruta2);
            } catch (IOException e) {
                System.err.println("Error al escribir el archivo: " + e.getMessage());


    }
    }}}
