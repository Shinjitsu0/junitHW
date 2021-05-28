import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    private static ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    void addStudent() {
        // given:
        Students students = new Students();
        Set<Student> testStudentSet = new HashSet<>();
        Student st1 = new Student("Vladimir", "B412", "001");
        testStudentSet.add(st1);

        // when:
        students.addStudent(st1);

        // then:
        Assertions.assertEquals(testStudentSet, students.studentSet);
    }

    @Test
    void addEqualStudent() {
        // given:
        Students students = new Students();
        Student st1 = new Student("Vladimir", "B412", "001");
        students.studentSet.add(st1);

        // when:
        students.addStudent(st1);

        // then:
        Assertions.assertEquals("Такой студент существует\n", output.toString());
    }

    @AfterAll
    public static void  cleanUpStreams() {
        System.setOut(null);
    }
}