//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Macbook mb1 = new Macbook("Macbook A1", "Gris", "A6484E");
        Macbook mb2 = new Macbook("Macbook A20", "Negro", "Ksaf");
        Macbook mb3 = new Macbook("Macbook Air", "Rosa", "A6fsr");

        //Al imprimir un valor static de cualquiera de los 3 objetos
        //la consola debe mostrar exactamente el mismo valor

        //Los miembros estaticos (static) deben ser accedidos sin necesidad de crear un objeto de ella
        System.out.println(mb1.SISTEMA_OPERATIVO);
        System.out.println(mb2.SISTEMA_OPERATIVO);
        System.out.println(mb3.SISTEMA_OPERATIVO);

        //Clase.miembroestatico
        System.out.println(Macbook.SISTEMA_OPERATIVO);

        //Macbook.SISTEMA_OPERATIVO("Linux");

        Macbook mb4 = new Macbook("Macbook A8", "Azul", "A6484E");
        Macbook mb5 = new Macbook("Macbook Pro", "Negro", "Ksaf");
        Macbook mb6 = new Macbook("Macbook Pro Max", "Amarillo", "A6fsr");

        //System.out.println(mb4.getSistemaOperativo());
        //System.out.println(mb5.getSistemaOperativo());
        //System.out.println(mb6.getSistemaOperativo());








    }
}