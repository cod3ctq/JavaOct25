package paquete2;

import com.Casa1; //Debe de importarse la clase que estamos por usar

public class Casa2 {

    Casa1 ca1 = new Casa1();

    public  Casa2() {
        ca1.fachada = "3";
        ca1.numero = 12;

        //No importa que modificador de acceso tengan los atributos
        //siempre deben ser accedidos a traves de Setter y Getter

        ca1.setFachada("3");
        ca1.setNumero(12);
    }

}
