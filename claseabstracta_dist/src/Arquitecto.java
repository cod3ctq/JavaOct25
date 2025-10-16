public class Arquitecto extends Profesionista implements IMecanica,IContabilidad{

    @Override//sobreescritura: redefinicion de la logica de un metodo
    public void trabajar(int horas) {
        System.out.println("crearPlanos, diseñarPlanos, supervisiar, presupuestos");
    }
    //Forma 3: metodos implementados de interfaces
    //acaban de ser mutados,
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
    //Estoy mutando la clase en cuanto a su comportamiento
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
