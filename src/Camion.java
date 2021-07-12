public class Camion {
    // Declarando atributos:
    private int chapa;
    private String color;
    private String modelo;
    private static int IDENTIFICADOR = 0; // variable estática que pertenece sólo a la clase (no a los objetos de la clase)
                                          // la idea es que este atributo se incremente en 1 cada vez que se cree un nuevo objeto de la clase
    private Cliente dueño;  // Atributo del tipo (o clase) Cliente, que se llama "dueño".


    // Constructor, en este caso sin parámetros
    public Camion() {
        this.chapa = 0000;          // "this" se refiere a un objeto del tipo camión, ese objeto se definirá luego en la clase del main
        this.color = "desconocido"; // conviene siempre asignar algún valor por defecto a los atributos en el constructor
        this.modelo = "desconocido";
        IDENTIFICADOR++;
    }

    // Constructor, con 1 parámetro: unaChapa
    public Camion(int unaChapa) {
        this.chapa = unaChapa;
        this.color = "desconocido";
        IDENTIFICADOR++;
    }

    // Constructor, con 2 parámetros: unaChapa y unColor
    public Camion(int unaChapa, String unColor) {
        this.chapa = unaChapa;
        this.color = unColor;
        IDENTIFICADOR++;
    }

    // Constructor, con 3 parámetros: unaChapa, unColor y unModelo
    public Camion(int unaChapa, String unColor, String unModelo) {
        this.chapa = unaChapa;
        this.color = unColor;
        this.modelo = unModelo;
        IDENTIFICADOR++;
    }

    // Métodos de acceso(get) y modificación(set) para cada atributo
    public int getChapa() {
        return this.chapa;
    }

    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String unColor){
        this.color = unColor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String unModelo) {
        this.modelo = unModelo;
    }

     public Cliente getDueño () { // Acá el return es de clase Cliente, porque así esta definido el atributo.
        return this.dueño;
    }

    public void setDueño (Cliente unDueño) { // Acá recibe por parámetro un dato de clase Cliente, porque así esta definido el atributo.
        this.dueño = unDueño;
    }

    // Método para comparar si dos camiones tienen el mismo color.
    // El método se aplica a un objeto tipo Camión, y compara sus atributos con los de otro objeto de la misma clase que se pasa por parámetro
    // (en este caso el segundo objeto es otroCamion de la clase Camion; esto es lo que se define como parámetro del método).
    public boolean tienenMismoColor (Camion otroCamion) {
        return this.getColor().equals(otroCamion.getColor());
    }

    // toString es un método de java para imprimir en pantalla
    public String toString() {
        return "Camión de color " + this.getColor() + " , chapa " + this.getChapa() + " y modelo " + this.getModelo();
    }








}
