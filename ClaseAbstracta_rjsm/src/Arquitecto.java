public class Arquitecto extends Profesionista implements Mecanica, IContabilidad{


    @Override //indica sobreescritura: la redefinicion de la logica de un metodo
    public void trabajar(int horas) {
        System.out.println("Crear planos, diseñar planos, supervisar obras, presupuestos");

    }
// forma 3: metodos implementados de interfaces
    @Override
    public void manejar() {

    }

    @Override
    public void cambiaraceite() {

    }

    @Override
    public void lavarmotor() {

    }

    @Override
    public void escaneartestigos() {

    }

    @Override
    public void hacerdeclaraciones() {

    }

    @Override
    public void facturar() {

    }

    @Override
    public void generarbalances() {

    }
}
