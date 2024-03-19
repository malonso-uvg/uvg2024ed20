import java.util.AbstractMap;
import java.util.Scanner;

public class ProgramUI{

    public static void main(String[] args) {
        System.out.println("Seleccione el tipo de mapa");
        Scanner in = new Scanner(System.in);
        MapFactory<Integer, String> fabricaMap = new MapFactory<Integer, String>();

        System.out.println("1. HashMap");
        System.out.println("2. Tree");
        System.out.println("3. LinkedHashMap");
        AbstractMap<Integer, String> dictionary = fabricaMap.getMapInstance( Integer.parseInt(in.nextLine()) );


        System.out.println("Ingrese 'salir' en cualquier momento para terminar.");

        System.out.println(dictionary.getClass().toString());
        
        while (true) {
            System.out.print("Ingrese el ID (entero): ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            int id;
            try {
                id = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número entero válido.");
                continue;
            }

            System.out.print("Ingrese el nombre: ");
            String nombre = in.nextLine();

            dictionary.put(id, nombre);
        }

        System.out.println("Contenido del HashMap:");
        for (Integer id : dictionary.keySet()) {
            System.out.println("ID: " + id + ", Nombre: " + dictionary.get(id));
        }

        in.close();


    }

}