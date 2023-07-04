package Lambda;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elene", 'f', 19, 1, 8.9);
        Student st4 = new Student("Piotr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
        info.testStudents(students, s -> s.age < 30);


    }
}

