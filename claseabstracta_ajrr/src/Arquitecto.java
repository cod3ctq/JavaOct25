


public class Arquitecto extends Profesionista implements IMecanico implements IContador{

    @Override //Indicar sobreescritura.
    //La sobreescritura es la redefinicion de la logica de un metodo
    public void trabajar(int horas) {

        System.out.println("Crear planos, diseñar planos, supervisa obra, presupuestos");

    }

    @Override
    public void manejar() {

    }

    @Override
    public void cambiarAceite() {

    }

    //Forma 3: Metodos implementados de interfaces


}
