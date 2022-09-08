package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StudentList {
    private static final List<Student> students = new ArrayList<>();
    public static List<Student> getStudents() {
        return students;
    }
    public static void addStudent(){
        Student student = new Student();
        String checkedId = Input.inputID("Enter student's ID: ");
        student.setId(checkedId);
        String name = Input.inputString("Enter student's name: ");
        student.setName(name);
        String address = Input.inputString("Enter student's address: ");
        student.setAddress(address);
        long phone = Input.inputInt("Enter student's phone number: ");
        student.setPhone(phone);
        students.add(student);
    }
    public static void printStudents(){
        students.forEach(System.out::println);
    }
    public static void searchStudents(){
        String id = Input.inputString("Enter student's ID to search: ");
        Student searchStudent = students
                .stream()
                .filter(student -> student.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);

        if (searchStudent == null){
            System.out.println("Not found ID " + id);
        } else {
            System.out.println(searchStudent);
        }

    }
}
