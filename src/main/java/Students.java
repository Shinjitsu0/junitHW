import java.util.*;

public class Students {
    Set<Student> studentSet = new HashSet<>();

    public Set<Student> addStudent(Student student) {
        if(studentSet.contains(student)){
            System.out.print("Такой студент существует\n");
        } else {
            studentSet.add(student);
            for(Student students: studentSet){
                System.out.println(students);
            }
        }
        return studentSet;
    }

    public void printStudentSet() {
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
