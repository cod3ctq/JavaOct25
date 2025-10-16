public abstract class Profesionista {
//Clase abstracta: Clase cualquiera que contiene al menos 1 metodo abierto
    String titulo;
    String celula;
    String nombre;



    public Profesionista (){

    }

    public Profesionista(String titulo, String celula, String nombre) {
        this.titulo = titulo;
        this.celula = celula;
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCelula() {
        return celula;
    }

    public void setCelula(String celula) {
        this.celula = celula;
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
                ", celula='" + celula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    // Metodo abstracto: Metodo sin cuerpo ni implementacion o logica
// Define el QUE debes hcaer pero sin el como
    public  abstract void trabajar(int horas);
}

//Una interfase es un contrato de acciones que deben cumplirse todas.
//Una interfaz no contiene atributos, Constructores, Getter and Setter,
// toString(). NO ES UN MODELO, ES UN CONTRATO

//para aplicar una interfaz se usa el Implemets
// es una implementacion no una herencia

//UNA INTERFAZ solo contiene metodos abstractos
