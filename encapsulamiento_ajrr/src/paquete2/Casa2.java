package paquete2;

import com.Casa1;

public class Casa2 extends Casa1{

    Casa1 ca1 = new Casa1();

    public Casa2(){
        //Acceso a un atributo public en una clase de otro paquete
        //Acceso incorrecto
        this.fachada = "232dd";
        this.numero = 12;

        this.acera="ekjfhdn";
        this.puerta="nkbedd";
        this.patio="kejbfd";


        //No importa que modificador de acceso tengan los atributos
        //Siempre deber ser accedidos a traves de getter/setter
        this.setFachada();
        this.getFachada();

    }

}
