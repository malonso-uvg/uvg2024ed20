import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVDataSource implements IDataSource {
    
    @Override
    public File saveStudents(List<Student> students, String path) {
        try {
            File file = new File(path+".csv");
            FileWriter writer = new FileWriter(file);

            // Escribir encabezados al archivo CSV
            writer.write("ID,First Name,Last Name\n");

            // Escribir cada estudiante al archivo CSV
            for (Student student : students) {
                writer.write(String.format("%d,%s,%s\n", student.getId(), student.getFirstName(), student.getLastName()));
            }

            writer.close();
            return file;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Student> getStudentsFromFile(File file, int fileType) {
        List<Student> students = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            // Leer encabezados (si los hay) para ignorarlos
            if ((line = reader.readLine()) != null) {
                // Puedes procesar los encabezados si es necesario
            }

            // Leer estudiantes desde el archivo CSV
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String firstName = parts[1];
                    String lastName = parts[2];
                    students.add(new Student(firstName, lastName, id));
                }
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

}
