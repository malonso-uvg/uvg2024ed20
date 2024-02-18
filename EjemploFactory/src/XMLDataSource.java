import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLDataSource implements IDataSource {

    private final XmlMapper xmlMapper;

    public XMLDataSource() {
        this.xmlMapper = new XmlMapper();
    }

    @Override
    public File saveStudents(List<Student> students, String path) {
        try {
            File file = new File(path+ ".xml");
            xmlMapper.writeValue(file, students);
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
