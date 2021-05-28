
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите информацию о студенте: ФиО, номер группы, номер студенческого билета");
            String student = scanner.nextLine();

            if (student.equals("стоп")) {
                break;
            }

            String[] array = student.split(", ");
            try {
                students.addStudent(new Student(array[0], array[1], array[2]));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка ввода");
            }
        }
        students.printStudentSet();
    }
}
