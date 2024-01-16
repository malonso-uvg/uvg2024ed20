import java.util.Scanner;

public class ProgramUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICalculator miCalculadora = new Calculador2();

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Realizar Suma");
            System.out.println("2. Realizar Multiplicación");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma(miCalculadora);
                    break;
                case 2:
                    realizarMultiplicacion(miCalculadora);
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 3);
        
        scanner.close();
    }

    private static void realizarSuma(ICalculator calculador) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = calculador.add(num1, num2);
        System.out.println("Resultado de la suma: " + resultado);
    }

    private static void realizarMultiplicacion(ICalculator calculador) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = calculador.mult(num1, num2);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    
}