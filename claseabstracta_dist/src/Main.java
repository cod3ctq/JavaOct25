//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //no es posible instanciar una clase abstracta
        //debido a que esta incompleta
        //el proposito de una clase abstracta es heredar a otras
    }
    //Interface: es un contrato de acciones que deben cumplirse todas
    //no contiene atributos ni getters ni setters ni constructores
    //ni metodo toString porque no e sun modelo, es un contrato
    //Es la separacion del qué y del como, solo nos enfocamos en el como
    //Se usa IMPLEMENTS, se esta implementando
    //una interface contiene solo metodos abstractos y nada mas
    //se les llama contratos porque tienes que cumplir con las acciones
    //que estan ahi (metodos)
}

//encapsulamiento: mecanismo para controlar la visibilidad y acceso a los
//detalles y miembros de una clase