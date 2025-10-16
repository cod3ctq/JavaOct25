//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Matebook mb1 = new Matebook("Matebook A1", "Gris", "A09402");
Matebook mb2 = new Matebook("Matebook A20", "Negro", "S02342");
Matebook mb3 = new Matebook("Matebook Air", "Rosa", "KSM3242");

//Los miembrps estaticos de una clase, deben ser accedidos
//sin necesidad de crear un objeto de alta
        System.out.println(mb1.SISTEMA_OPERATIVO);
        System.out.println(mb2.SISTEMA_OPERATIVO);
        System.out.println(mb3.SISTEMA_OPERATIVO);

//C
        System.out.println(Matebook.SISTEMA_OPERATIVO);
//No es posible reasignar un valor constante
      //  Matebook.SISTEMA_OPERATIVO("Linux");

        Matebook mb4 = new Matebook("Matebook A8", "Gris", "A09402");
        Matebook mb5 = new Matebook("Matebook PRO", "Negro", "S02342");
        Matebook mb6 = new Matebook("Matebook PRO MAX", "AMARILLO", "KSM3242");

       // System.out.println(mb4.getSistemaOperativo());
        //System.out.println(mb5.getSistemaOperativo());
        //System.out.println(mb6.getSistemaOperativo());

    }
}