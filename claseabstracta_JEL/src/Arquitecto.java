public class Arquitecto extends Profesionista implements Imecanica, Icontabilidad {



    @Override // Indica sobreescriura
    public void trabajar(int horas) {
        System.out.println("Diseñar planos, crear planos, supervisar obra, presupuesto");
    }

    //Forma 3 : Metodos implementados de interfaces
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
    public void declaracion() {

    }

    @Override
    public void factura() {

    }

    @Override
    public void generarBalances() {

    }
}
