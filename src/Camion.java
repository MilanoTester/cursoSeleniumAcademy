public class Camion {
    // Declarando atributos:
    private int chapa;
    private String color;


    // Constructor, en este caso sin parámetros
    public Camion() {
        this.chapa = 0000;          // "this" se refiere a un objeto del tipo camión, ese objeto se definirá luego en la clase del main
        this.color = "desconocido"; // conviene siempre asignar algún valor por defecto a los atributos en el constructor
    }
    // Constructor, con 1 parámetro: unaChapa
    public Camion(int unaChapa) {
        this.chapa = unaChapa;
        this.color = "desconocido";
    }
    // Constructor, con 2 parámetros: unaChapa y unColor
    public Camion(int unaChapa, String unColor) {
        this.chapa = unaChapa;
        this.color = unColor;
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

    public String toString() {
        return "Camión de color " + this.getColor() + " y chapa " + this.getChapa();
    } // toString es un método de java para imprimir en pantalla








}
