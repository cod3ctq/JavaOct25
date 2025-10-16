import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Macbook mb1 = new Macbook("Macbook A1", "Gris", "A09482");
        Macbook mb2 = new Macbook("Macbook A20", "Negro", "F5482");
        Macbook mb3 = new Macbook("Macbook Air", "Rosa", "K545");

        //Al imprimir un valor Static de cualquiera de los 3 objetos
        //La consola debe de mostrar exactamente el mismo valor


        //Los miembros estaticos de una clase, deben ser accedidos
        //Sin necesidad de crear un objeto de ella
        System.out.println(mb1.SISTEMAOPERATIVO);
        System.out.println(mb2.SISTEMAOPERATIVO);
        System.out.println(mb3.SISTEMAOPERATIVO);

        //Clase miembroestatico
        System.out.println(Macbook.SISTEMAOPERATIVO);

        Macbook.SISTEMAOPERATIVO = "Firefox OS";


        Macbook.setSistemaOperativo("Linux");
        Macbook mb4 = new Macbook("Macbook A8", "Azul", "A09482");
        Macbook mb5 = new Macbook("Macbook Pro", "Negro", "F5482");
        Macbook mb6 = new Macbook("Macbook Pro Max", "Amarillo", "d545");

        System.out.println(mb4.getSistemaOperativo());
        System.out.println(mb5.getSistemaOperativo());
        System.out.println(mb6.getSistemaOperativo());
    }
}