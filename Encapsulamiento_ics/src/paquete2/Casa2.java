package paquete2;

import com.Casa1;

public class Casa2 extends Casa1{

    Casa1 cas1 = new Casa1();

    public Casa2(){
        //Acceso a un atributo public en una clase de otro paquete
        //acceso incorrecto
        this.fachada = "";
        this.mumero = 12;

        //Forma correcta
        this.setFachada("jndrk");
        this.setMumero(15);

        //No importa que modificador de acceso tengan los atributos, siempre deben ser accedidos
        //atraves de getter o setter

        //Acceso a atributos protegidos en una clase de otro paquetes es posible solo con herencia
        this.setFachada("bjhrbfr");
        this.setMumero(34);



    }


}
