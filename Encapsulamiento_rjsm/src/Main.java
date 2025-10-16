//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Macbook mb1= new Macbook("Mackbook a1","Gris","487898547975");
        Macbook mb2 = new Macbook("Mackbook a2","Negro","487892335");
        Macbook mb3 = new Macbook("Mackbook air","rosa","487892335");
        System.out.println(mb1.getSistemaOperativo());
        System.out.println(mb2.getSistemaOperativo());
        System.out.println(mb3.getSistemaOperativo());
//Clase.miembrostatic
        Macbook.getSistemaOperativo();
        System.out.println(Macbook.getSistemaOperativo());

        Macbook.setSistemaOperativo("Linux");
        Macbook mb4= new Macbook("Mackbook a8","Gris","487898547975");
        Macbook mb5 = new Macbook("Mackbook a5","Negro","487892335");
        Macbook mb6 = new Macbook("Mackbook pro max","rosa","487892335");
    }
}