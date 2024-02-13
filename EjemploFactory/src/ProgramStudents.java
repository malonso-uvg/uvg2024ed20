import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramStudents {

    
    public static void main(String[] args) {
        // Ejemplo de uso
        XMLDataSource dataSource = new XMLDataSource();
        List<Student> studentsToSave = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean continueEntering = true;

        while (continueEntering) {
            System.out.println("Ingrese el nombre del estudiante (o 'fin' para terminar): ");
            String firstName = scanner.nextLine();

            if ("fin".equalsIgnoreCase(firstName)) {
                continueEntering = false;
                break;
            }

            System.out.println("Ingrese el apellido del estudiante: ");
            String lastName = scanner.nextLine();

            System.out.println("Ingrese el ID del estudiante: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()

            studentsToSave.add(new Student(firstName, lastName, id));
        }

        // Guardar estudiantes en un archivo XML
        File savedFile = dataSource.saveStudents(studentsToSave, "students.xml");
        System.out.println("Estudiantes guardados en: " + savedFile.getAbsolutePath());

        // Leer estudiantes desde el archivo XML ToBeFixed
        //List<Student> studentsFromFile = dataSource.getStudentsFromFile(savedFile, 0);
        //System.out.println("Estudiantes leídos desde el archivo XML: " + studentsFromFile);
    }

    
}
