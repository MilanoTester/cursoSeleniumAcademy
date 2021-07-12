public class Cliente {

    // Atributos
    private String nombre;
    private int edad;
    private int DNI;

    // Constructor sinp
    public Cliente() {
        this.nombre = "sin nombre";
        this.edad = 99;
        this.DNI = 0;
    }

    // Constructor con 1 parámetro: nombre
    public Cliente(String unNombre) {
        this.nombre = unNombre;
        this.edad = 99;
        this.DNI = 0;
    }

    // Constructor con 2 parámetros: nombre y edad
    public Cliente(String unNombre, int unaEdad) {
        this.nombre = unNombre;
        this. edad = unaEdad;
        this.DNI = 0;
    }

    // Constructor con 3 parámetros: nombre, edad y DNI
    public Cliente (String unNombre, int unaEdad, int unDNI) {
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.DNI = unDNI;
    }

    // Métodos get
    public String getNombre () {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public int getDNI() {
        return  this.DNI;
    }

    // Métodos set
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }
    public void setDNI(int unDNI) {
        this.DNI = unDNI;
    }

    public String toString () {
        return "El nombre del cliente es " + this.getNombre() + ", su edad es " + this.getEdad() + " y su DNI es " + this.getDNI();
    }









}
