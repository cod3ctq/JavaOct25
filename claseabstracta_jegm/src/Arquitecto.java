public class Arquitecto extends Profesionista implements IMecanica{


    @Override //indica sobre escritura
    public void trabajar(int horas) {
        System.out.println("Crear planos, diseñar planos, supervisar obra, presupuestos ");
    }
    // Metodos forma 3: implementados de interfaces
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
