import java.util.*;

public class Student {
    private final String name;
    private final String group;
    private final String id;

    public Student(String name, String group, String id) {
        this.name = name;
        this.group = group;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("ФиО: %s, Номер группы: %s, Номер билета: %s", getName(), getGroup(), getId());
    }
}
