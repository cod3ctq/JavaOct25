public class Arquitecto extends Profesionista implements IMecanico,IContabilidad{


    @Override//Indica sobreescritura
    //Sobreescritura: La redefinicion de la logica de un metodo
    public void trabajar(int horas) {
        System.out.println("Crear planos, supervisar obras, presupuestos");
    }

//Forma 3 : Metodos implementados de unterfases
    @Override
    public void manejar() {

    }

    @Override
    public void cambiarAceites() {

    }

    @Override
    public void lavarMotor() {

    }

    @Override
    public void hacerdeclaraciones() {

    }

    @Override
    public void hacerbalance() {

    }

    @Override
    public void Facturar() {

    }
}
