//clase abstracta: clase cualquiera que contiene al menos
//un metodo abstracto
public abstract class Profesionista {
    String titulo, cedula, nombre;
    public Profesionista(){

    }

    public Profesionista(String titulo, String cedula, String nombre) {
        this.titulo = titulo;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "titulo='" + titulo + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //metodo abstracto: metodo sin cuerpo, es decir,
    //sin implementacion o logica.
    //definir la idea general
    //el qué debes hacer, pero sin el cómo, porque no tiene llaves.
    //puede recibir parametros
    public abstract void trabajar(int horas);
}
