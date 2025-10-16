//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Encapsulamiento: Mecanismo para controlar la visibilidad
    //y acceso a los detalles y a los miembros de una clase.

        //Clase.

        Macbook mb1 = new Macbook("Macbook A1", "Gris", "A09482");
        Macbook mb2 = new Macbook("Macbook A20", "Negro", "S02342");
        Macbook mb3 = new Macbook("Macbook Air", "Rosa", "KSM3242");

    //Los miembros estaticos de una clase, deben ser accedidos
    //sin necesidad de crear un objeto de ella
        System.out.println(mb1.getSistemaOperativo());
        System.out.println(mb2.getSistemaOperativo());
        System.out.println(mb3.getSistemaOperativo());

    //Clase.miembroestatico
        System.out.println(Macbook.getSistemaOperativo());

        /*Integer.parseInt("7");
        Character.toString('G');*/

        Macbook.setSistemaOperativo("Linux");
        Macbook mb4 = new Macbook("Macbook A8", "Azul", "A09482");
        Macbook mb5 = new Macbook("Macbook Pro", "Negro", "S02342");
        Macbook mb6 = new Macbook("Macbook Pro Max", "Amarillo", "KSM3242");

        System.out.println(mb4.getSistemaOperativo());
        System.out.println(mb5.getSistemaOperativo());
        System.out.println(mb6.getSistemaOperativo());








    }
}