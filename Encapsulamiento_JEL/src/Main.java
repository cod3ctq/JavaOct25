
public class Main {
    public static void main(String[] args) {

    Macbook mb1 = new Macbook("Macbook A1", "Gris", "A234234344");
    Macbook mb2 = new Macbook("Macbook A2", "Negro", "B234234344");
    Macbook mb3 = new Macbook("Macbook A3", "Rosa", "C234234344");

        //Al imprimir un valor static de cualquiera de los 3 objetos
        //La consola debe mostrar exactamente el mismo valor

        //Los miembros estaticos de una clase, deben ser accedidos
        //sin necesidad de crear un objeto de ella
    //System.out.println(mb1.getSistemaOperativo());
        //System.out.println(mb2.getSistemaOperativo());
    //System.out.println(mb3.getSistemaOperativo());

    //Clase.miembroestatico

       // System.out.println(Macbook.getSistemaOperativo());
        //rEASIGNAR UN ATRIBUTO ESTATICO
        //Macbook.setSistemaOperativo("Linux");

        //Macbook.SISTEMAOPERATIVO = "Fire"

        Macbook mb4 = new Macbook("Macbook A8", "Gris", "A234234344");
        Macbook mb5 = new Macbook("Macbook Pro", "Negro", "B234234344");
        Macbook mb6 = new Macbook("Macbook Pro max", "Amarilo", "C234234344");

       // System.out.println(mb4.SISTEMAOPERATIVO()); //NO ES LO CORRECTO, PERO SE PUEDE LLAMAR AL FINAL
       // System.out.println(Macbook.SISTEMAOPERATIVO()); //FORMA CORRECTA
       // System.out.println(Macbook.SISTEMAOPERATIVO()); //FORMA CORRECTA

    }
}