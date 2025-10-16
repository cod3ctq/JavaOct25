import javax.crypto.Mac;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //encapsulamiento: mecanismo para controlar la visibilidad
        // y acceso a los detalles y miembros de una clase

        //privado, solo se puede tener acceso directo
        //desde la clase/dentro de ella.
        Macbook mb1=new Macbook("Macbook A1","Gris","AD351461F");
        Macbook mb2=new Macbook("Macbook A2","Negro","AUVG32DG");
        Macbook mb3=new Macbook("Macbook A3","Rosa","AVGF4364H");
        //Al imprimir un valor static cualquiera se debe mostrar el
        //mismo valor para todos los objetos
        //los miembros estaticos de una clase deben ser accedidos
        //sin necesidad de crear un objeto de ella
        System.out.println(mb1.SISTEMA_OP);
        System.out.println(mb2.SISTEMA_OP);
        System.out.println(mb3.SISTEMA_OP);
        //clase.miembroestatico
        System.out.println(Macbook.SISTEMA_OP);
        //reasignar un atributo estatico
        //cuando es final no se puede reasignar un valor constante (final)
        //Macbook.setsistemaOp("Linux");
        Macbook mb4=new Macbook("Macbook A11","verde","AD351461F");
        Macbook mb5=new Macbook("Macbook A12","cafe","AUVG32DG");
        Macbook mb6=new Macbook("Macbook A13","amarillo","AVGF4364H");
        //System.out.println(mb4.getsistemaOp());
        //System.out.println(mb5.getsistemaOp());
        //System.out.println(mb6.getsistemaOp());

        //final permite crear valores inmutables, es decir,
        //que no se pueden cambiar su valor y ahora se convierte
        //en constante (valor global que no puede ser cambiado
        //en tiempo de ejecucion)
        //las constantes en java se escriben en mayusculas todas
        //sd separan con "_" si tienen mas de una palabra
    }
}