//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mathbook mb1 = new Mathbook("Macbook A1","Gris","ASSD233");
        Mathbook mb2 = new Mathbook("Macbook A20","Negro","rty65433");
        Mathbook mb3 = new Mathbook("Macbook Air","Rosa","A233");

        //Al imprimir un valor static de cualquiera de los 3 onjetos
        //la consola debe mostrar exactamente el mismo valor

        //Los miembros estaticos de una clase, deben ser accedidos
        //sin necesidad de crear un objeto de ella
        System.out.println(mb1.SISTEMA_OPERATIVO());
        System.out.println(mb2.SISTEMA_OPERATIVO());
        System.out.println(mb3.SISTEMA_OPERATIVO());

        //Clase.miembroestatico
        System.out.println(Mathbook.SISTEMA_OPERATIVO);

        //Mathbook.setSistemaOperativo("Linux");

        //No es posible reasignar un valor constante
        Mathbook.SISTEMA_OPERATIVO ="Firefox OS";

        Mathbook mb4 = new Mathbook("Macbook A1","Gris","ASSD233");
        Mathbook mb5 = new Mathbook("Macbook A20","Negro","rty65433");
        Mathbook mb6 = new Mathbook("Macbook Air","Rosa","A233");

//        System.out.println(mb4.getSistemaOperativo());
//        System.out.println(mb5.getSistemaOperativo());
//        System.out.println(mb6.getSistemaOperativo());




    }
}