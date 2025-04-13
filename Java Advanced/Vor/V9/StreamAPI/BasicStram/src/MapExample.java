import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        //  Stream.of(1, 2, 3, 4, 5).map(n -> n * 2).forEach(System.out::println);


        // Student, id, username,password,adrese,noten ,Klausuren

        //analyse noten
        //noten
        List<Student> studentList2 = new ArrayList<>(Arrays.asList(
                new Student("Nour", 25, 2),
                new Student("Laila", 29, 3),
                new Student("Hussein", 30, 4)
        ));
        //studentList2.stream()
        //   streamlist.sorted((a, b) -> a.getName().compareTo(b.getName())).map(s -> s.getNote()).forEach(System.out::println);
        // von Student List zur Integer List aus Noten

        Stream<Student> streamlist = studentList2.stream();

        String[] filterWords = {"java", "c++", "javascript", "python"};
        Stream<String> feld = Stream.of(filterWords);
        //feld.map(s->s.toUpperCase()).forEach(System.out::println);




    }
}

class Student {
    int note;
    String name;
    int age;

    public Student(String name, int age, int note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{Name " + name + ", Age " + age + ", Note " + note + "}";
    }
}
