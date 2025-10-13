import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lectura y escritura de archivos con Java
        //Lectura
        String ruta="C:\\Users\\Admin\\Desktop\\Archivo1.txt";
        String ruta2="C:\\Users\\Admin\\Desktop\\Archivo2.txt";
        File file = new File(ruta); //Representación del archivo en memoria
        File file2 = new File(ruta2);
        String linea; //auxiliar
        int a=0,e=0,i=0,o=0,u=0;

        try {
            FileReader fr = new FileReader(file); //copia del contenido del archivo en memoria RAM
            BufferedReader br = new BufferedReader(fr);// Lee el caché
            //Mientras la línea tenga algún contenido
            while ((linea = br.readLine()) != null) {
                linea=linea.toLowerCase();
                for (int j = 0; j < linea.length(); j++) {
                    char c = linea.charAt(j);
                    if (c == 'a') a++;
                    else if (c == 'e') e++;
                    else if (c == 'i') i++;
                    else if (c == 'o') o++;
                    else if (c == 'u') u++;
                }
                System.out.println(linea);
            }
            fr.close();
            //crear código para contar cuantas veces aparece cada una de las vocales
            //en todo el texto.

            //Escribir el conteo de cada vocal en el archivo 2
            //Escritura
            FileWriter fw = new FileWriter(file2);
            fw.write("Conteo de vocales:\n");
            fw.write("La letra 'A' aparece: " + a + " veces en el texto \n");
            fw.write("La letra 'E' aparece: " + e + " veces en el texto \n");
            fw.write("La letra 'I' aparece: " + i + " veces en el texto \n");
            fw.write("La letra 'O' aparece: " + o + " veces en el texto \n");
            fw.write("La letra 'U' aparece: " + u + " veces en el texto \n");
            fw.close(); //si no lo cierras no se guarda lo que se escribió
            System.out.println("✅ Conteo guardado correctamente en " + ruta2);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}