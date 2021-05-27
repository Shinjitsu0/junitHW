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
        Set<Student> soursStudentSet = new HashSet<>();
        Set<Student> finiteStudentSet = new HashSet<>();
        Student st1 = new Student("Vladimir", "B412", "001");
        soursStudentSet.add(st1);

        // when:
        students.addStudent(st1, finiteStudentSet);

        // then:
        Assertions.assertEquals(soursStudentSet, finiteStudentSet);
    }

    @Test
    void addEqualStudent() {
        // given:
        Students students = new Students();
        Set<Student> soursStudentSet = new HashSet<>();
        Student st1 = new Student("Vladimir", "B412", "001");
        soursStudentSet.add(st1);

        // when:
        students.addStudent(st1, soursStudentSet);

        // then:
        Assertions.assertEquals("Такой студент существует", output.toString());
    }

    @AfterAll
    public static void  cleanUpStreams() {
        System.setOut(null);
    }
}