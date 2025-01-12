import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonHandler {

    private ObjectMapper objectMapper;

    public JsonHandler() {
        objectMapper = new ObjectMapper();
    }

    // JSON dosyasına veri kaydetme
    public void saveToJson(String filename, List<?> list) throws IOException {
        objectMapper.writeValue(new File(filename), list);
    }

    // JSON dosyasından veri okuma
    public List<?> loadFromJson(String filename, Class<?> clazz) throws IOException {
        return objectMapper.readValue(new File(filename), objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
    }
}
