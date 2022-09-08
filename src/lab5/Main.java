package lab5;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    WELCOME TO STUDENT MANAGEMENT
                    1. Create
                    2. View all student information
                    3. Search
                    4. Exit""");
            int choice  = Input.inputInt("Enter your choice> ");
            switch (choice){
                case 1 -> StudentList.addStudent();
                case 2 -> StudentList.printStudents();
                case 3 -> StudentList.searchStudents();
                default -> System.exit(0);
            }
        }
    }
}
