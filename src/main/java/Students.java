import java.util.*;

public class Students {

    public Set<Student> addStudent(Student student, Set<Student> studentSet) {
        if(studentSet.contains(student)){
            System.out.print("Такой студент существует");
        } else {
            studentSet.add(student);
            for(Student students: studentSet){
                System.out.println(students);
            }
        }
        return studentSet;
    }

    public void printStudentSet(Set<Student> studentSet) {
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
