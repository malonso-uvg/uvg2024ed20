import java.util.Scanner;

public class Paridad{
    public static void main(String[] args) {
    
        MiStack stack = new MiStack();
        //Leer la cadena
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cadena con los parentesis");
        String input = in.nextLine();

        //Revisar letra por letra de la cadena
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '('){
                stack.push("" + input.charAt(i));
            } else if (input.charAt(i) == ')'){
                if (stack.pop() == null){
                    System.out.println("Ocurrio un error falta parentesis abierto");
                    break;
                }
            }
        }

        if (stack.count() == 0){
            System.out.println("Parentesis correctos");
        } else {
            System.out.println("Faltan parentesis cerrados");
        }
            
    }
}
