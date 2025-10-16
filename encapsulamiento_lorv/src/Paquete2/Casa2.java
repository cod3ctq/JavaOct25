package Paquete2;

import com.Casa1;

public class Casa2 extends Casa1 {

    Casa1 ca1 = new Casa1();

    public Casa2(){
        ca1.fachada = " ";
        ca1.numero = 12;

        //Acceso a atributos protegidos en una clase de otro paquete
        // es posible solo cuando se aplica herencia
        this.acera="sadsd";
        this.patio = "asdasdas";
        this.puerta="asdasdas";

        //No importa que un modificador de accesao tenga los atributos
        //siempre deben ser accedidos a traves de Getter/setters
        ca1.setFachada("asfsdf");
        ca1.setNumero(23);
    }
}
