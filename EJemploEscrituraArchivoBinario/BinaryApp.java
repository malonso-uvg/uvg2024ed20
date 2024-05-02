import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class BinaryApp{
    public static void main(String[] args){
        String cadenaAGuardar = "11110101010101111010";

        int cantidadElementos = cadenaAGuardar.length();
        int residuo = cantidadElementos % 8;
        if (residuo != 0) {
            // Calcular cuántos ceros se necesitan agregar al inicio
            int cerosFaltantes = 8 - residuo;
            
            // Rellenar con ceros al inicio
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < cerosFaltantes; i++) {
                sb.append('0');
            }
            sb.append(cadenaAGuardar); // Agregar la cadena binaria original al final de los ceros agregados
            cadenaAGuardar = sb.toString(); // Actualizar la cadena binaria
            cantidadElementos += cerosFaltantes; // Actualizar la cantidad de elementos
        }

        //Voy convirtiendo los valores de 8 en 8
        ArrayList<Byte> bytesSalida = new ArrayList<Byte>();
        while (cadenaAGuardar.length() > 0) {
            String ochoBites = cadenaAGuardar.substring(0,8);
            cadenaAGuardar = cadenaAGuardar.substring(8, cadenaAGuardar.length());
            bytesSalida.add( (byte)( binarioADecimal(Integer.parseInt(ochoBites)) - 128) );
        }
        
         try {
            
            FileOutputStream fos = new FileOutputStream("C:\\Ejemplos\\data.bin");

            // Datos binarios que deseas guardar (en este caso, simplemente un array de bytes de ejemplo)
            Byte[] datos = new Byte[bytesSalida.size()];
            datos = bytesSalida.toArray(datos);

            byte[] datosOutput = new byte[bytesSalida.size()];
            int i = 0;
            for(Byte dato : datos){
                datosOutput[i] = dato;
                i++;
            }

            // Escribir los datos en el archivo
            fos.write(datosOutput);
            
            // Cerrar el flujo de salida
            fos.close();
            
            System.out.println("Archivo binario guardado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo binario: " + e.getMessage());
        }

    }

    public static int binarioADecimal(int numeroBinario) {
        int numeroDecimal = 0;
        int base = 1; // La base inicial es 2^0

        while (numeroBinario > 0) {
            int digito = numeroBinario % 10; // Obtener el último dígito del número binario
            numeroBinario = numeroBinario / 10; // Descartar el último dígito
            numeroDecimal += digito * base; // Multiplicar el dígito por la base y sumarlo al número decimal
            base *= 2; // Incrementar la base multiplicando por 2
        }

        return numeroDecimal;
    }
}