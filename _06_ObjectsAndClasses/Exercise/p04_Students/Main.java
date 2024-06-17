package L06ObjectsAndClasses.Exercise.P04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());

        //създаваме списък в който съхраняваме обектите student
        List<Student> studentsList = new ArrayList<>();

        for (int i = 1; i <= studentsCount; i++) {
            String input = scanner.nextLine();
            String[] studentDataArr = input.split(" ");
            String firstName = studentDataArr[0];
            String lastName = studentDataArr[1];
            double grade = Double.parseDouble(studentDataArr[2]);

            //създаваме обект student от класа Student =
            // нов обект от този клас който се създава чрез конструктор new Student(firstname, lastName, grade);
            Student student = new Student(firstName, lastName, grade);
            studentsList.add(student);
        }

        //сортираме студентите по оценка в низходящ ред
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student item:studentsList) {
            System.out.println(item);
        }
    }
}
