import java.util.Scanner; // para leer desde el teclado

public class ProgramaRecibeFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creo el lector

        // pido la frase completa
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine(); // leo toda la línea


        // pido la letra a buscar (usaré el primer caracter que escribas)
        System.out.print("Escribe una letra que deseas buscar: ");
        String entrada = sc.nextLine(); // leo lo que escriba el usuario

        if (entrada.length() == 0) { // si no escribió nada
            System.out.println("No escribiste ninguna letra.");
            sc.close();
            return;
        }

        char letra = entrada.charAt(0); // me quedo con el primer caracter
        int contador = 0; // aquí voy sumando cuántas veces aparece el caracter elegido

        // recorro la frase caracter por caracter
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i); // caracter actual
            if (c == letra) {         // comparo con la letra buscada (sensible a mayúsculas)
                contador++;
            }
        }

        // muestro el resultado
        if (contador == 0) {
            System.out.println("Carácter no encontrado");
        } else {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
            //se puede mejorar ya que al dar de resultado una letra dices 1 veces
        }

        sc.close(); // cierro el scanner
    }
}
