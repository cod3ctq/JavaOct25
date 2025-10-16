public class Arquitecto extends Profesionista implements IMecanica, IContabilidad{



    @Override //Indica sobreescritura (la redefinición de la lógica de un método)
    public void trabajar(int horas) {
        System.out.println("Crear planos, diseñar planos, supervisar obra, presupuestos");

    }


    //Forma 3: metodos implementados de interfaces
    @Override
    public void manejar() {

    }

    @Override
    public void cambiarAceite() {

    }

    @Override
    public void lavarMotor() {

    }

    @Override
    public void escanearTestigos() {

    }

    @Override
    public void hacerDeclaraciones() {

    }

    @Override
    public void facturar() {

    }

    @Override
    public void generarBalances() {

    }
}
