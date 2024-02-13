import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONDataSource implements IDataSource {

    private final ObjectMapper objectMapper;

    public JSONDataSource() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public File saveStudents(List<Student> students, String path) {
        try {
            File file = new File(path+ ".json");
            objectMapper.writeValue(file, students);
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
            students = objectMapper.readValue(file, new TypeReference<List<Student>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

}
