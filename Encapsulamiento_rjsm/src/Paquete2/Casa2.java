package Paquete2;

import com.Casa1;

public class Casa2 extends Casa1 {




    public Casa2(){
// forma incorrecta
        this.fachada="";
        this.numero=12;

        //Acceso a atributos protegidos en clase de otro paquete
        //es posible solo cuando se aplica herencia
        this.acera="";
        this.patio="";
        this.puerta="";

        //forma correcta
        this.setFachada("eue");
        this.setNumero(12);
    //No importa que modificador de acceso tengan los atributos
        //siempre deben ser accedidos con getter y setters
    }






}
