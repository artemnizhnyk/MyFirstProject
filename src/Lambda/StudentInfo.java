package Lambda;

import java.util.ArrayList;

public class StudentInfo {
    public void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }

        }


    }
}
