import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import ru.hsdks.converter.Student;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConventTest {
    private ObjectMapper objectMapper = new ObjectMapper();
    Student studentTest = new Student(2, "Вася", "JavaTest");
    File file = new File("studentTest.json");


    @Test
    void writer() {
        try {
            objectMapper.writeValue(file, studentTest);
        } catch (IOException e) {}
    }

    @Test
    void read() {
        try {
            StudentTest studentTestResult = objectMapper.readValue(file, StudentTest.class);
            System.out.println(studentTestResult);
        } catch (IOException e) {}
    }
}