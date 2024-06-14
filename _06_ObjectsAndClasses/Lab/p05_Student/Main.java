package L06ObjectsAndClasses.Lab.P05Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentArr = input.split(" ");
            String firstName = studentArr[0];
            String lastName = studentArr[1];
            int age = Integer.parseInt(studentArr[2]);
            String homeTown = studentArr[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            studentList.add(student);

            input = scanner.nextLine();
        }
        String inputTown = scanner.nextLine();

        for (Student item : studentList) {
            if (item.getHomeTown().equals(inputTown)) {
                System.out.println(item);
            }
        }
    }
}
