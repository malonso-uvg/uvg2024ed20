import java.io.File;
import java.util.List;

public interface IDataSource {
    public File saveStudents(List<Student> students, String path);

    public List<Student> getStudentsFromFile(File file, int fileType);
}
