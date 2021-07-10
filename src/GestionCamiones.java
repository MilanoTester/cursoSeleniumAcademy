import java.util.Scanner;

public class GestionCamiones {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Camion c1 = new Camion(); // se crea el objeto c1 del tipo (o clase) Camión
        c1.setChapa(4444);    // al camión c1 se le asigna la chapa 4444
        c1.setColor("negro"); // al camión c1 se le asigna el color negro
        System.out.println("El color del camión c1 es: " + c1.getColor()); // se muestra el color asignado previamente
        System.out.println("La chapa del camión c1 es: " + c1.getChapa()); // se muestra la chapa asignada previamente

        Camion c2 = new Camion();
        System.out.println("El color del camión c2 es: " + c2.getColor()); // muestra el color definido por defecto en el constructor
        System.out.println("La chapa del camión c2 es: " + c2.getChapa()); // muestra la chapa definida por defecto en el constructor

        Camion c3 = new Camion(); // método llama al constructor sin parámetros
        System.out.println(c3); // el programa llama al método toString en la clase Camion; toString muestra un string con los atributos del objeto

        Camion c4 = new Camion(123); // método llama al constructor con 1 parámetro
        System.out.println(c4);

        Camion c5 = new Camion(9000, "verde"); // método llama al constructor con 2 parámetros
        System.out.println(c5);

        System.out.println("Ingrese el color del camión:");
        String colorCamion = input.nextLine();

        System.out.println("Ingrese la chapa del camión:");
        int chapaCamion = input.nextInt();

        Camion c6 = new Camion(chapaCamion, colorCamion);
        System.out.println(c6);


    }

}
