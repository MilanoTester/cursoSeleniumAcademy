import java.util.Scanner;
import java.util.SortedMap;

public class GestionCamiones {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Crear un camión y setearle parámetros
        Camion c1 = new Camion(); // se crea el objeto c1 del tipo (o clase) Camión
        c1.setChapa(4444);    // al camión c1 se le asigna la chapa 4444
        c1.setColor("negro"); // al camión c1 se le asigna el color negro
        System.out.println("El color del camión c1 es: " + c1.getColor()); // se muestra el color asignado previamente
        System.out.println("La chapa del camión c1 es: " + c1.getChapa()); // se muestra la chapa asignada previamente

        // Crear un camión sin asignarle parámetros; trae los parámetros seteados en el constructor
        Camion c2 = new Camion();
        System.out.println("El color del camión c2 es: " + c2.getColor()); // muestra el color definido por defecto en el constructor
        System.out.println("La chapa del camión c2 es: " + c2.getChapa()); // muestra la chapa definida por defecto en el constructor

        // Uso del constructor sin parámetros, y del método toString
        Camion c3 = new Camion(); // método llama al constructor sin parámetros
        System.out.println(c3); // el programa llama al método toString en la clase Camion; toString muestra un string con los atributos del objeto

        // Uso del constructor con un parámetro, y del método toString
        Camion c4 = new Camion(123); // método llama al constructor con 1 parámetro
        System.out.println(c4);

        // Uso del constructor con dos parámetros, y del método toString
        Camion c5 = new Camion(9000, "verde"); // método llama al constructor con 2 parámetros
        System.out.println(c5);

        // Pedir datos al usuario para generar un camión nuevo
        System.out.println("Ingrese el modelo del camión:");
        String modeloCamion = input.nextLine();

        System.out.println("Ingrese el color del camión:");
        String colorCamion = input.nextLine();

        System.out.println("Ingrese la chapa del camión:");
        int chapaCamion = input.nextInt();

        Camion c6 = new Camion(chapaCamion, colorCamion);
        System.out.println(c6);

        // Comparar si los colores de dos camiones son iguales. Llama a un método definido en el archivo de la clase Camion
        boolean sonIguales = c1.tienenMismoColor(c2); // en este caso compara los camiones c1 y c2
        if ( sonIguales == true ) {
            System.out.println("Los camiones tienen el mismo color.");
        } else {
            System.out.println("Los camiones no tienen el mismo color.");
        }

        // Crear un camión con los 3 atributos:
        Camion c7 = new Camion(chapaCamion, colorCamion, modeloCamion);
        System.out.println(c7);

        // Nueva clase creada: Cliente
        // Creando nuevos clientes:
        Cliente cliente1 = new Cliente("Juan", 45, 123456);
        System.out.println(cliente1);

    }



}
