import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramUI{

    public static void main(String[] args) {
        System.out.println("Seleccione el tipo de mapa");
        Scanner in = new Scanner(System.in);
        MapFactory<Integer, String> fabricaMap = new MapFactory<Integer, String>();
        MapFactory<Integer, ArrayList<String>> fabricaMapRepetidos = new MapFactory<Integer, ArrayList<String>>();

        System.out.println("1. HashMap");
        System.out.println("2. Tree");
        System.out.println("3. LinkedHashMap");
        int option = Integer.parseInt(in.nextLine());
        AbstractMap<Integer, String> dictionary = fabricaMap.getMapInstance( option );
        AbstractMap<Integer, ArrayList<String>> repetidos = fabricaMapRepetidos.getMapInstance( option );

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

            //Logica para los repetidos
            if (repetidos.get(id) == null){ //La llave no existe
                ArrayList<String> nuevoRepetido = new ArrayList<String>();
                nuevoRepetido.add(nombre);
                repetidos.put(id, nuevoRepetido);
            } else {
                repetidos.get(id).add(nombre);
            }
        }

        System.out.println("Contenido del HashMap:");
        for (Integer id : dictionary.keySet()) {
            System.out.println("ID: " + id + ", Nombre: " + dictionary.get(id));
        }

        System.out.println("Contenido del HashMap de Repetidos:");
        for (Integer id : repetidos.keySet()) {
            for (String name : repetidos.get(id)){
                System.out.println("ID: " + id + ", Nombre: " + name);
            }
            
        }

        in.close();


    }

}