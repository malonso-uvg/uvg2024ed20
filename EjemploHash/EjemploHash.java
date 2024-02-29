import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.HashMap;

public class EjemploHash {

    public static String getMD5(String input){

        try {
            // Obtener la instancia de MessageDigest con el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Calcular el hash MD5
            byte[] hashedBytes = md.digest(input.getBytes());

            // Convertir el arreglo de bytes a una representación hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            String md5Hash = sb.toString();

            return md5Hash;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<String, String> estudiantes = new HashMap<String, String>();
        String input = "";
        
        do{
            System.out.println("Ingrese el nombre del estudiante");
            input = in.nextLine();

            if (!input.equalsIgnoreCase("Salir")){
                String idEstudiante = getMD5(input);
                estudiantes.put(idEstudiante, input);
            }

        }while(!input.equalsIgnoreCase("Salir"));

        
        System.out.println("Ingrese el nombre del estudiante a buscar");
        input = in.nextLine();
        String key = getMD5(input);

        if (estudiantes.get(key) != null){
            System.out.println("El estudiante existe");
        } else {
            System.out.println("NO se encontro estudiante");
        }


    }
     
}