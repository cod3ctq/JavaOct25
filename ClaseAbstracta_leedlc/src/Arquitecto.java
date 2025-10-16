public class Arquitecto extends Profesionista implements IMecanica, Icontabilidad{

    @Override
    public void trabajar(int horas) {
        System.out.println("Crear planos, diseñar planos, supervisar obra, presupuestos");
    }

    //forma 3 : metodos implementados de interfaces
    @Override
    public void manejar() {
        System.out.println("En proceso de manejar");
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Cambiando el aceite");
    }

    @Override
    public void lavarMotor() {
        System.out.println("Esta lavando elmotor");
    }

    @Override
    public void escanearTestigos() {
        System.out.println("Escaneando un vehiculo");
    }

    @Override
    public void hacerDeclaraciones() {
        System.out.println("Haciendo una declaracioin");
    }

    @Override
    public void facturar() {
        System.out.println("Haciendo una facturacion");
    }

    @Override
    public void generarBalances() {
        System.out.println("Generando un reporte de balance");
    }
}
