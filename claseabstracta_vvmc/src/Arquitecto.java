public class Arquitecto extends Profesionista implements IMecanica{

    @Override //indica sobrescritura
    public void trabajar(int horas) {
        System.out.println("Crear planos, diseñar planos, supervisar obra, presupuestos");
    }

    //Forma 3: Métodos implementados de interfaces
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
}
