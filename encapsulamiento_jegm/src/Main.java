//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Al imprimir un valor static de cualquiera de los 3 objetos
        // la consola debe mostrar exactamente el mismo valor
        Macbook mb1 = new Macbook("Mackbook A1","Gris","A09482");
        Macbook mb2 = new Macbook("Mackbook A20","Negra","S02342");
        Macbook mb3 = new Macbook("Mackbook Air","Rosa","KSM3242");
        //Los miembros estáticos de una clase, deben ser accedidos
        // sin necesidad de crear un objeto de ella
        System.out.println(mb1.getSistemaOperativo());
        System.out.println(mb2.getSistemaOperativo());
        System.out.println(mb3.getSistemaOperativo());
        // Clase.miembro estático
        System.out.println(Macbook.sistemaOperativo);
        Macbook.setSistemaOperativo("Linux");

        Macbook mb4 = new Macbook("Mackbook A8","Azul","S02342");
        Macbook mb5 = new Macbook("Mackbook Pro","Negro","S02342");
        Macbook mb6 = new Macbook("Mackbook Pro Max","Amarillo","S02342");
    }
}