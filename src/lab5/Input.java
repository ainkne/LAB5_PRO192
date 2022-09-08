package lab5;

import java.util.Scanner;
public class Input {
    static Scanner sc = new Scanner(System.in);
    public static int inputInt(String msg){
        System.out.print(msg);
        while (true){
            try {
                return Integer.parseInt(sc.nextLine().trim());

            } catch (NumberFormatException e){
                System.out.println("Wrong format, try again.");
                System.out.print(">> ");
            }
        }
    }
    public static String inputString(String msg){
        System.out.print(msg);
        while (true) {
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.print("You enter nothing, try again.");
                System.out.print(">>");
            }
        }
    }
    public static String inputID(String msg){
        System.out.print(msg);
        while (true){
            String id = sc.nextLine().trim();
            if (id.isEmpty()) {
                System.out.print("You enter nothing, try again.");
                System.out.print(">>");
            } else if (checkUniID(id)) {
                System.out.println(id.toUpperCase() + " already in our database, try again!");
                System.out.print(">> ");
            } else {
                return id;
            }
        }
    }
    private static boolean checkUniID(String id){
        for (Student student: StudentList.getStudents()){
            return id.equalsIgnoreCase(student.getId());
        } return false;
    }
}
