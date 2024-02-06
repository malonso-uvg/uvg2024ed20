import java.util.Random;

public class EjemploUI{

    public static void main(String[] args){
        int N = 20;

        Integer[] randomNumbers = new Integer[N];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            randomNumbers[i] = rand.nextInt(3000) + 1; // Genera números aleatorios entre 1 y 3000
            System.out.println("[" + i +"] => " + randomNumbers[i]);
        }

        System.out.println("Ordenando...");
        BubbleSort<Integer> ordenamientoBurbuja = new BubbleSort<Integer>();
        ComparadorNumeros miComparadorNumeros = new ComparadorNumeros();

        ordenamientoBurbuja.sort(randomNumbers, miComparadorNumeros);

        for (int i = 0; i < N; i++) {
            System.out.println("[" + i +"] => " + randomNumbers[i]);
        }

        System.out.println("Probando con cadenas");

        String[] randomStrings = new String[N];
        rand = new Random();

        for (int i = 0; i < N; i++) {
            int length = rand.nextInt(10) + 1; // Longitud aleatoria entre 1 y 10 letras
            StringBuilder randomString = new StringBuilder();

            for (int j = 0; j < length; j++) {
                char randomChar = (char) (rand.nextInt(26) + 'a'); // Genera una letra minúscula aleatoria
                randomString.append(randomChar);
            }

            randomStrings[i] = randomString.toString();
        }

        for (int i = 0; i < N; i++) {
            System.out.println("[" + i + "] => " + randomStrings[i]);
        }

        BubbleSort<String> ordenamientoBurbujaCad = new BubbleSort<String>();
        ComparadorCadenas<String> compCadenas = new ComparadorCadenas<String>();
        ordenamientoBurbujaCad.sort(randomStrings, compCadenas);
        System.out.println("Ordenando cadenas...");

        for (int i = 0; i < N; i++) {
            System.out.println("[" + i + "] => " + randomStrings[i]);
        }

        System.out.println("Probando con automoviles");

        Automovil[] automoviles = new Automovil[N];

        for (int i = 0; i < N; i++) {
            // Puedes personalizar la generación de datos según tus necesidades
            String marca = "Marca" + i;
            int modelo = 2022;
            String linea = "Linea" + i;
            double precio = Math.random() * 100000; // Precio aleatorio

            automoviles[i] = new Automovil(marca, modelo, linea, precio);
        }

         // Imprimir los automóviles generados
         for (Automovil auto : automoviles) {
            System.out.println("Marca: " + auto.getMarca() +
                               ", Modelo: " + auto.getModelo() +
                               ", Línea: " + auto.getLinea() +
                               ", Precio: $" + auto.getPrecio());
        }

        BubbleSort<Automovil> ordenamientoBurbujaAuto = new BubbleSort<Automovil>();
        ComparadorAutomovil<Automovil> compAutos = new ComparadorAutomovil<Automovil>();
        ordenamientoBurbujaAuto.sort(automoviles, compAutos);
        System.out.println("Ordenando Automoviles...");


        for (Automovil auto : automoviles) {
            System.out.println("Marca: " + auto.getMarca() +
                               ", Modelo: " + auto.getModelo() +
                               ", Línea: " + auto.getLinea() +
                               ", Precio: $" + auto.getPrecio());
        }

        
    }
}