//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Macbook mb1 = new Macbook("A1","GRIS","A0813");
        Macbook mb2 = new Macbook("A1","GRIS","A0813");
        Macbook mb3 = new Macbook("A1","GRIS","A0813");

        //AL imprimir un  valor static de cualquiera de los 3 objetos
        //laconsola debe mostar exactamente el mismo valor

        System.out.println(mb1.getSistemaOperativo());
        System.out.println(mb2.getSistemaOperativo());
        System.out.println(mb3.getSistemaOperativo());

        //Clase.miembroestatico

       // System.out.println(Macbook.getSistemaOperativo());





    }
}