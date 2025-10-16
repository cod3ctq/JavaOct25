//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MacBook mb1 = new MacBook("Macbook A1","Gris","A09482");
        MacBook mb2 = new MacBook("Macbook A20","Negro","SO9482");

        System.out.println(mb1.SISTEMA_OPERATIVO);
        //Clase.miembroEstatico
        System.out.println(MacBook.SISTEMA_OPERATIVO);

        //no es posible reasignar un valor constante
        //MacBook.SISTEMA_OPERATIVO = "Linux";

        MacBook mb3 = new MacBook("Macbook Air","Rosa","KSM9482");

        System.out.println(MacBook.SISTEMA_OPERATIVO);

    }
}